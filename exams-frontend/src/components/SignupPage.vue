<template>
  <div class="w-full bg-gray-900 flex items-center justify-center px-4 py-12">
    <div
      class="bg-gray-800 rounded-xl shadow-xl overflow-hidden border border-gray-700/50"
    >
      <!-- Header -->
      <div
        class="bg-gradient-to-r from-indigo-900/30 to-purple-900/30 p-6 text-center border-b border-gray-700/50"
      >
        <h1 class="text-2xl font-bold text-white">Create Your Account</h1>
        <p class="text-gray-300 mt-1 text-sm">
          Already registered?
          <router-link
            to="/users/log_in"
            class="font-semibold text-indigo-400 hover:text-indigo-300 transition-colors"
          >
            Sign in here
          </router-link>
        </p>
      </div>

      <!-- Form -->
      <div class="p-6 sm:p-8">
        <form @submit.prevent="handleSubmit">
          <!-- Error Message -->
          <p v-if="hasErrors" class="text-red-400 text-sm mb-4">
            Oops, something went wrong! Please check the errors below.
          </p>

          <!-- Name -->
          <div class="grid grid-cols-1 md:grid-cols-2 gap-4 mb-4">
            <input
              v-model="form.firstname"
              type="text"
              placeholder="First Name"
              required
              class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
            <input
              v-model="form.lastname"
              type="text"
              placeholder="Last Name"
              required
              class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
          </div>

          <!-- Username -->
          <div class="mb-4">
            <input
              v-model="form.username"
              type="text"
              placeholder="Username"
              required
              class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
          </div>

          <!-- Email -->
          <div class="mb-4">
            <input
              v-model="form.email"
              type="email"
              placeholder="Email"
              required
              class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
          </div>

          <!-- Role Dropdown -->
          <div class="mb-4">
            <select
              v-model="form.role"
              required
              class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            >
              <option disabled value="">Select account type</option>
              <option value="student">Student Account</option>
              <option value="university">University Account</option>
            </select>
          </div>

          <!-- Conditional University Dropdown -->
          <div class="mb-4" v-if="form.role === 'student'">
            <select
              v-model="form.university_id"
              required
              class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            >
              <option disabled value="">Select your university</option>
              <option v-for="uni in universities" :key="uni.id" :value="uni.id">
                {{ uni.name }}
              </option>
            </select>
          </div>

          <!-- Conditional University Dropdown -->
          <div class="mb-4" v-if="form.role === 'university'">
            <label
              for="university"
              class="block text-sm font-medium text-gray-300 mb-1"
              >NOTE: The User Name entered will be used as your University
              Name*</label
            >
          </div>

          <!-- Passwords -->
          <div class="grid grid-cols-1 md:grid-cols-2 gap-4 mb-6">
            <input
              v-model="form.password"
              type="password"
              placeholder="Password"
              required
              class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
            <input
              v-model="form.confirm_password"
              type="password"
              placeholder="Confirm Password"
              required
              class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500"
            />
          </div>

          <!-- Submit Button -->
          <button
            type="submit"
            class="w-full bg-gradient-to-r from-indigo-600 to-purple-600 hover:from-indigo-700 hover:to-purple-700 text-white font-medium py-2.5 px-4 rounded-lg transition-all duration-200 shadow-lg"
          >
            Create Account
          </button>
        </form>
      </div>

      <!-- Footer -->
      <div
        class="px-6 py-4 bg-gray-800/50 border-t border-gray-700/50 text-center"
      >
        <p class="text-xs text-gray-400">
          By registering, you agree to our
          <router-link to="#" class="text-indigo-400 hover:underline"
            >Terms</router-link
          >
          and
          <router-link to="#" class="text-indigo-400 hover:underline"
            >Privacy Policy</router-link
          >
        </p>
      </div>
    </div>
  </div>
</template>

<script setup>
import { reactive, ref } from "vue";
import { useRouter } from "vue-router";

// Router instance for navigation
const router = useRouter();

const universities = ref([
  { id: 1, name: "University of Elixir" },
  { id: 2, name: "Phoenix Tech" },
  { id: 3, name: "LiveView Academy" },
]);

const form = reactive({
  firstname: "",
  lastname: "",
  username: "",
  email: "",
  role: "",
  university_id: "",
  password: "",
  confirm_password: "",
});

const hasErrors = ref(false);

const handleSubmit = async () => {
  // Basic validation
  if (form.password !== form.confirm_password) {
    hasErrors.value = true;
    return;
  }

  const userData = JSON.stringify({
    username: form.username,
    firstname: form.firstname,
    lastname: form.lastname,
    email: form.email,
    password: form.password,
    confirm_password: form.confirm_password,
    role: form.role,
    university_id: form.role === "student" ? form.university_id : null,
  });

  try {
    // Replace this with your actual login API call
    const response = await fetch("/api/users", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
      body: userData,
    });

    if (response.ok) {
      const data = await response.json();
      console.log(data);

      router.push("/users/log_in");
    } else {
      const errorData = await response.json();
      errors.general = errorData.message || "Invalid account data";
    }
  } catch (error) {
    console.error("Signup error:", error);
    errors.general = "An error occurred. Please try again.";
  } finally {
    hasErrors.value = false;
  }
};
</script>
