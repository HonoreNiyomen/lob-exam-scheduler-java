<template>
  <div class="w-full bg-gray-900 flex items-center justify-center px-4 py-12">
      <div class="bg-gray-800 rounded-xl shadow-xl overflow-hidden border border-gray-700/50">
        <!-- Header -->
        <div class="bg-gradient-to-r from-indigo-900/30 to-purple-900/30 p-6 text-center border-b border-gray-700/50">
          <h1 class="text-2xl font-bold text-white">Create Your Account</h1>
          <p class="text-gray-300 mt-1 text-sm">
            Already registered?
            <router-link to="/users/log_in" class="font-semibold text-indigo-400 hover:text-indigo-300 transition-colors">
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
              <input v-model="form.firstname" type="text" placeholder="First Name" required
                class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
              <input v-model="form.lastname" type="text" placeholder="Last Name" required
                class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
            </div>

            <!-- Username -->
            <div class="mb-4">
              <input v-model="form.username" type="text" placeholder="Username" required
                class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
            </div>

            <!-- Email -->
            <div class="mb-4">
              <input v-model="form.email" type="email" placeholder="Email" required
                class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
            </div>

            <!-- Role Dropdown -->
            <div class="mb-4">
              <select v-model="form.role" required
                class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500">
                <option disabled value="">Select account type</option>
                <option value="student">Student Account</option>
                <option value="university">University Account</option>
              </select>
            </div>

            <!-- Conditional University Dropdown -->
            <div class="mb-4" v-if="form.role === 'student' || form.role === 'university'">
              <select v-model="form.university_id" required
                class="w-full bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500">
                <option disabled value="">Select your university</option>
                <option v-for="uni in universities" :key="uni.id" :value="uni.id">{{ uni.name }}</option>
              </select>
            </div>

            <!-- Passwords -->
            <div class="grid grid-cols-1 md:grid-cols-2 gap-4 mb-6">
              <input v-model="form.password" type="password" placeholder="Password" required
                class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
              <input v-model="form.confirm_password" type="password" placeholder="Confirm Password" required
                class="bg-gray-700 text-white border border-gray-600 rounded px-4 py-2 focus:ring-indigo-500 focus:border-indigo-500" />
            </div>

            <!-- Submit Button -->
            <button type="submit"
              class="w-full bg-gradient-to-r from-indigo-600 to-purple-600 hover:from-indigo-700 hover:to-purple-700 text-white font-medium py-2.5 px-4 rounded-lg transition-all duration-200 shadow-lg">
              Create Account
            </button>
          </form>
        </div>

        <!-- Footer -->
        <div class="px-6 py-4 bg-gray-800/50 border-t border-gray-700/50 text-center">
          <p class="text-xs text-gray-400">
            By registering, you agree to our
            <router-link to="#" class="text-indigo-400 hover:underline">Terms</router-link>
            and
            <router-link to="#" class="text-indigo-400 hover:underline">Privacy Policy</router-link>
          </p>
        </div>
      </div>
  </div>
</template>

<script setup>
import { reactive, ref } from 'vue'

const universities = ref([
  { id: 1, name: 'University of Elixir' },
  { id: 2, name: 'Phoenix Tech' },
  { id: 3, name: 'LiveView Academy' },
])

const form = reactive({
  firstname: '',
  lastname: '',
  username: '',
  email: '',
  role: '',
  university_id: '',
  password: '',
  confirm_password: '',
})

const hasErrors = ref(false)

const handleSubmit = () => {
  // Basic validation
  if (form.password !== form.confirm_password) {
    hasErrors.value = true
    return
  }

  hasErrors.value = false
  // TODO: send `form` data to backend (via Axios or Fetch)
  console.log('Form submitted:', form)
}
</script>
