<template>
    <div class="bg-gray-900 text-gray-100 min-h-screen w-full">
        <!-- Navbar -->
        <nav class="bg-gray-800 border-b border-gray-700 w-full">
            <div class="w-full px-4 sm:px-6 lg:px-8">
                <div class="flex items-center justify-between h-16">
                    <!-- Logo -->
                    <div class="p-1 bg-gray-500 rounded">
                        <img class="max-w-32" src="/lob_favicon.png" alt="LOB EXAMS"/>
                    </div>

                    <!-- Desktop Links -->
                    <div class="hidden md:flex md:items-center md:space-x-4">
                        <RouterLink to="/"
                            class="px-3 py-2 rounded-md text-sm font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                            :class="{ 'bg-gray-900': $route.path === '/' }">
                            Home
                        </RouterLink>
                        <RouterLink to="/features"
                            class="px-3 py-2 rounded-md text-sm font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                            :class="{ 'bg-gray-900': $route.path === '/features' }">
                            Features
                        </RouterLink>
                        <RouterLink to="/developers"
                            class="px-3 py-2 rounded-md text-sm font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                            :class="{ 'bg-gray-900': $route.path === '/developers' }">
                            Developer
                        </RouterLink>
                        <RouterLink to="/contact"
                            class="px-3 py-2 rounded-md text-sm font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                            :class="{ 'bg-gray-900': $route.path === '/contact' }">
                            Contact
                        </RouterLink>
                    </div>

                    <!-- Desktop Auth Buttons -->
                    <div class="hidden md:flex md:items-center md:space-x-2">
                        <RouterLink to="/users/log_in"
                            v-if="$route.path !== '/users/log_in' && $route.path !== '/users/register'"
                            class="px-4 py-2 rounded-md text-sm font-medium text-white bg-indigo-500 hover:bg-indigo-600 transition duration-200">
                            Login
                        </RouterLink>
                        <RouterLink to="/users/register"
                            v-if="$route.path !== '/users/register' && $route.path !== '/users/log_in'"
                            class="px-4 py-2 rounded-md text-sm font-medium text-white bg-indigo-500 hover:bg-indigo-600 transition duration-200">
                            Register
                        </RouterLink>
                    </div>

                    <!-- Mobile Menu Toggle -->
                    <div class="md:hidden">
                        <button type="button" aria-label="Toggle menu"
                            class="inline-flex items-center justify-center p-2 rounded-md text-gray-400 hover:text-white hover:bg-gray-700 focus:outline-none transition duration-200"
                            @click="toggleMenu">
                            <svg class="h-6 w-6" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M4 6h16M4 12h16M4 18h16" />
                            </svg>
                        </button>
                    </div>
                </div>
            </div>

            <!-- Mobile Menu -->
            <div v-show="mobileMenuOpen" class="md:hidden bg-gray-800 border-t border-gray-700 w-full">
                <div class="px-2 pt-2 pb-3 space-y-1">
                    <RouterLink to="/"
                        class="block px-3 py-2 rounded-md text-base font-medium text-white bg-gray-900 transition duration-200"
                        @click="mobileMenuOpen = false">Home</RouterLink>
                    <RouterLink to="/features"
                        class="block px-3 py-2 rounded-md text-base font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                        @click="mobileMenuOpen = false">Features</RouterLink>
                    <RouterLink to="/developers"
                        class="block px-3 py-2 rounded-md text-base font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                        @click="mobileMenuOpen = false">Developer</RouterLink>
                    <RouterLink to="/contact"
                        class="block px-3 py-2 rounded-md text-base font-medium text-gray-300 hover:text-white hover:bg-gray-700 transition duration-200"
                        @click="mobileMenuOpen = false">Contact</RouterLink>
                    <RouterLink to="/users/log_in"
                        class="block px-3 py-2 mt-2 rounded-md text-base font-medium text-white bg-indigo-600 hover:bg-indigo-700 transition duration-200"
                        @click="mobileMenuOpen = false">Login</RouterLink>
                    <RouterLink to="/users/register"
                        class="block px-3 py-2 rounded-md text-base font-medium text-white bg-indigo-600 hover:bg-indigo-700 transition duration-200"
                        @click="mobileMenuOpen = false">Register</RouterLink>
                </div>
            </div>
        </nav>

        <!-- Main View -->
        <main class="w-full">
            <router-view />
        </main>

        <!-- Footer -->
        <footer class="bg-gray-800 mt-12 w-full">
            <div class="w-full py-12 px-4 sm:px-6 lg:px-8">
                <div class="grid grid-cols-2 md:grid-cols-4 gap-8 max-w-none">
                    <div>
                        <h3 class="text-sm font-semibold text-gray-400 tracking-wider uppercase">Product</h3>
                        <ul class="mt-4 space-y-4">
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Features</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Developer</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Documentation</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h3 class="text-sm font-semibold text-gray-400 tracking-wider uppercase">Company</h3>
                        <ul class="mt-4 space-y-4">
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">About</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Blog</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Careers</a>
                            </li>
                        </ul>
                    </div>
                    <div>
                        <h3 class="text-sm font-semibold text-gray-400 tracking-wider uppercase">Legal</h3>
                        <ul class="mt-4 space-y-4">
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Privacy</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Terms</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Cookie
                                    Policy</a></li>
                        </ul>
                    </div>
                    <div>
                        <h3 class="text-sm font-semibold text-gray-400 tracking-wider uppercase">Connect</h3>
                        <ul class="mt-4 space-y-4">
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Instagram</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">GitHub</a>
                            </li>
                            <li><a href="#"
                                    class="text-base text-gray-300 hover:text-white transition duration-200">Email</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="mt-12 border-t border-gray-700 pt-8">
                    <p class="text-base text-gray-400 text-center">
                        &copy; 2025 LOBExam. All rights reserved. Built with Vue.js and SprintBoot.
                    </p>
                </div>
            </div>
        </footer>
    </div>
</template>

<script setup>
import { ref } from 'vue'

const mobileMenuOpen = ref(false)

function toggleMenu() {
    mobileMenuOpen.value = !mobileMenuOpen.value
}
</script>