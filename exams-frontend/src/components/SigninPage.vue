<template>
  <div
    class="min-h-auto flex items-center justify-center bg-gray-900 px-4 py-12 w-full"
  >
    <div class="w-full max-w-md">
      <div class="bg-gray-800 rounded-xl shadow-lg overflow-hidden p-8">
        <!-- Header -->
        <div class="text-center mb-8">
          <h1 class="text-3xl font-bold text-white mb-2">Welcome Back</h1>
          <p class="text-gray-400">
            Sign in to your LOB Exam Scheduler account
          </p>
        </div>

        <!-- Login Form -->
        <form @submit.prevent="handleLogin" class="space-y-6">
          <!-- Email Input -->
          <div>
            <label
              for="email"
              class="block text-sm font-medium text-gray-300 mb-2"
            >
              Email
            </label>
            <input
              id="email"
              v-model="form.email"
              type="email"
              required
              class="w-full px-3 py-2 border border-gray-600 rounded-md bg-gray-700 text-white placeholder-gray-400 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-transparent transition duration-200"
              placeholder="Enter your email"
            />
            <div v-if="errors.email" class="mt-1 text-sm text-red-400">
              {{ errors.email }}
            </div>
          </div>

          <!-- Password Input -->
          <div>
            <label
              for="password"
              class="block text-sm font-medium text-gray-300 mb-2"
            >
              Password
            </label>
            <input
              id="password"
              v-model="form.password"
              type="password"
              required
              class="w-full px-3 py-2 border border-gray-600 rounded-md bg-gray-700 text-white placeholder-gray-400 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-transparent transition duration-200"
              placeholder="Enter your password"
            />
            <div v-if="errors.password" class="mt-1 text-sm text-red-400">
              {{ errors.password }}
            </div>
          </div>

          <!-- Remember Me & Forgot Password -->
          <div class="flex items-center justify-between">
            <div class="flex items-center">
              <input
                id="remember_me"
                v-model="form.rememberMe"
                type="checkbox"
                class="h-4 w-4 text-indigo-600 bg-gray-700 border-gray-600 rounded focus:ring-indigo-500 focus:ring-2"
              />
              <label for="remember_me" class="ml-2 block text-sm text-gray-300">
                Keep me logged in
              </label>
            </div>
            <div class="text-sm">
              <RouterLink
                to="/users/reset_password"
                class="font-semibold text-indigo-400 hover:text-indigo-300 hover:underline transition duration-200"
              >
                Forgot your password?
              </RouterLink>
            </div>
          </div>

          <!-- Submit Button -->
          <div>
            <button
              type="submit"
              :disabled="isLoading"
              class="w-full flex justify-center items-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500 disabled:opacity-50 disabled:cursor-not-allowed transition duration-200"
            >
              <span v-if="isLoading" class="mr-2">
                <svg
                  class="animate-spin h-4 w-4 text-white"
                  fill="none"
                  viewBox="0 0 24 24"
                >
                  <circle
                    class="opacity-25"
                    cx="12"
                    cy="12"
                    r="10"
                    stroke="currentColor"
                    stroke-width="4"
                  ></circle>
                  <path
                    class="opacity-75"
                    fill="currentColor"
                    d="M4 12a8 8 0 018-8V0C5.373 0 0 5.373 0 12h4zm2 5.291A7.962 7.962 0 014 12H0c0 3.042 1.135 5.824 3 7.938l3-2.647z"
                  ></path>
                </svg>
              </span>
              {{ isLoading ? "Logging in..." : "Sign In" }}
              <span v-if="!isLoading" aria-hidden="true" class="ml-2">→</span>
            </button>
          </div>

          <!-- General Error Message -->
          <div v-if="errors.general" class="text-center text-sm text-red-400">
            {{ errors.general }}
          </div>
        </form>

        <!-- Sign Up Link -->
        <div class="mt-6 text-center">
          <p class="text-gray-400">
            Don't have an account?
            <RouterLink
              to="/users/register"
              class="font-semibold text-indigo-400 hover:text-indigo-300 hover:underline transition duration-200"
            >
              Sign up
            </RouterLink>
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, reactive } from "vue";
import { useRouter } from "vue-router";

const router = useRouter();

// Form data
const form = reactive({
  email: "",
  password: "",
  rememberMe: false,
});

// Loading state
const isLoading = ref(false);

// Error handling
const errors = reactive({
  email: "",
  password: "",
  general: "",
});

// Clear errors when user starts typing
const clearErrors = () => {
  errors.email = "";
  errors.password = "";
  errors.general = "";
};

// Form validation
const validateForm = () => {
  clearErrors();
  let isValid = true;

  if (!form.email) {
    errors.email = "Email is required";
    isValid = false;
  } else if (!/\S+@\S+\.\S+/.test(form.email)) {
    errors.email = "Please enter a valid email address";
    isValid = false;
  }

  if (!form.password) {
    errors.password = "Password is required";
    isValid = false;
  } else if (form.password.length < 6) {
    errors.password = "Password must be at least 6 characters";
    isValid = false;
  }

  return isValid;
};

// Handle form submission
const handleLogin = async () => {
  if (!validateForm()) {
    return;
  }

  isLoading.value = true;
  clearErrors();

  try {
    const body = JSON.stringify({
        email: form.email,
        password: form.password,
        remember_me: form.rememberMe,
      });
    // Replace this with your actual login API call
    const response = await fetch("/api/log_in", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
      body: body
    });

    console.log("response: " + response + " body: " + body);

    if (response.ok) {
      const data = await response.json();
      console.log(data);
      localStorage.setItem("token", data.token);
      localStorage.setItem("current_user", JSON.stringify(data.user));

      router.push("/u/dashboard");
    } else {
      const errorData = await response.json();
      errors.general = errorData.message || "Invalid email or password";
    }
  } catch (error) {
    console.error("Login error:", error);
    errors.general = "An error occurred. Please try again.";
  } finally {
    isLoading.value = false;
  }
};

// Watch for form changes to clear errors
import { watch } from "vue";

watch(() => form.email, clearErrors);
watch(() => form.password, clearErrors);
</script>
