<template>
    <div class="bg-gray-900 text-gray-100 min-h-screen">
        <!-- Top Navigation Bar -->
        <header
            class="fixed top-0 w-full z-50 bg-gray-800 border-b border-gray-700 p-4 flex items-center justify-between">
            <!-- Mobile menu button -->
            <div class="relative md:hidden">
                <button type="button" aria-label="Toggle menu"
                    class="inline-flex items-center justify-center p-2 rounded-md text-gray-400 hover:text-white hover:bg-gray-700 focus:outline-none"
                    @click="mobileMenuOpen = !mobileMenuOpen">
                    <svg class="h-6 w-6" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M4 6h16M4 12h16M4 18h16" />
                    </svg>
                </button>
            </div>

            <!-- Admin Name -->
            <div class="hidden md:flex md:flex-col p-1 border-b border-gray-700">
                <h1 v-if="currentUser" class="text-xl font-bold text-indigo-600 font-baloo">
                    {{ currentUser.firstname }} {{ currentUser.lastname }}
                </h1>
            </div>

            <!-- Current Page Title -->
            <h2 class="text-xl font-semibold">{{ currentPage.toUpperCase() }}</h2>

            <!-- Notification Icons -->
            <div class="flex items-center space-x-4">
                <button
                    class="hidden md:flex relative items-center p-2 rounded-md text-gray-400 hover:text-white hover:bg-blue-700 focus:outline-none">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                        stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9" />
                    </svg>
                    <span class="absolute top-0 right-0 h-2 w-2 rounded-full bg-green-500"></span>
                </button>

                <button
                    class="hidden md:flex relative items-center p-2 rounded-md text-gray-400 hover:text-white hover:bg-blue-700 focus:outline-none">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                        stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M8 10h.01M12 10h.01M16 10h.01M9 16H5a2 2 0 01-2-2V6a2 2 0 012-2h14a2 2 0 012 2v8a2 2 0 01-2 2h-5l-5 5v-5z" />
                    </svg>
                    <span class="absolute top-0 right-0 h-2 w-2 rounded-full bg-green-500"></span>
                </button>

                <!-- Settings Dropdown -->
                <div class="relative">
                    <button class="p-2 rounded-md text-gray-400 hover:text-white hover:bg-blue-700 focus:outline-none"
                        @click="settingsDropdownOpen = !settingsDropdownOpen">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z" />
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M15 12a3 3 0 11-6 0 3 3 0 016 0z" />
                        </svg>
                    </button>

                    <!-- Dropdown Menu -->
                    <div v-if="settingsDropdownOpen"
                        class="absolute right-0 mt-2 w-48 bg-gray-800 rounded-lg shadow-lg z-50 py-1 border border-gray-700 font-bold">
                        <router-link to="/general_settings"
                            class="flex items-center px-4 py-3 text-sm text-white-700 hover:bg-gray-700"
                            @click="settingsDropdownOpen = false">
                            <i class="fas fa-user-circle mr-3 text-white-500"></i>
                            Profile Settings
                        </router-link>

                        <a href="#" class="flex items-center px-4 py-3 text-sm text-white-700 hover:bg-gray-700">
                            <i class="fas fa-moon mr-3 text-white-500"></i>
                            Theme
                        </a>

                        <a href="#"
                            class="md:hidden flex items-center px-4 py-3 text-sm text-white-700 hover:bg-gray-700">
                            <i class="fas fa-user-circle mr-3 text-white-500"></i>
                            Notifications
                        </a>

                        <a href="#"
                            class="md:hidden flex items-center px-4 py-3 text-sm text-white-700 hover:bg-gray-700">
                            <i class="fas fa-messages mr-3"></i>
                            Messages
                        </a>

                        <a href="#" class="flex items-center px-4 py-3 text-sm text-white-700 hover:bg-gray-700">
                            <i class="fas fa-question-circle mr-3 text-white-500"></i>
                            Help & Support
                        </a>

                        <div class="border-t border-gray-700 my-1"></div>

                        <button
                            class="flex items-center w-full px-4 py-3 text-sm text-left text-red-600 hover:bg-gray-700"
                            @click="logout">
                            <i class="fas fa-sign-out-alt mr-3 text-lg"></i>
                            Logout
                        </button>
                    </div>
                </div>
            </div>
        </header>

        <!-- Main Layout -->
        <div class="flex pt-16 h-screen">
            <!-- Desktop Sidebar -->
            <aside class="hidden md:w-64 md:bg-gray-800 border-r border-gray-700 md:flex md:flex-col">
                <!-- Main nav content -->
                <nav class="flex-1 p-4 space-y-2">
                    <router-link to="/dashboard"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/dashboard' }">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6" />
                        </svg>
                        <span>Dashboard</span>
                    </router-link>

                    <template v-if="currentUser && currentUser.role !== 'student'">
                        <router-link to="/exam_schedule"
                            class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                            :class="{ 'bg-gray-900': $route.path === '/exam_schedule' }">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                                stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z" />
                            </svg>
                            <span>Exam Schedule</span>
                        </router-link>

                        <router-link to="/rooms"
                            class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                            :class="{ 'bg-gray-900': $route.path === '/rooms' }">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                                stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M19 21V5a2 2 0 00-2-2H7a2 2 0 00-2 2v16m14 0h2m-2 0h-5m-9 0H3m2 0h5M9 7h1m-1 4h1m4-4h1m-1 4h1m-5 10v-5a1 1 0 011-1h2a1 1 0 011 1v5m-4 0h4" />
                            </svg>
                            <span>Rooms</span>
                        </router-link>
                    </template>
                    <template v-else>
                        <router-link to="/upcoming_exams"
                            class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                            :class="{ 'bg-gray-900': $route.path === '/upcoming_exams' }">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                                stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z" />
                            </svg>
                            <span>Upcoming Exams</span>
                        </router-link>
                    </template>

                    <router-link v-if="currentUser"
                        :to="currentUser.role !== 'student' ? '/invigilators' : '/assigned_invigilators'"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700" :class="{
                            'bg-gray-900': $route.path === '/invigilators' || $route.path === '/assigned_invigilators'
                        }">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M12 4.354a4 4 0 110 5.292M15 21H3v-1a6 6 0 0112 0v1zm0 0h6v-1a6 6 0 00-9-5.197M13 7a4 4 0 11-8 0 4 4 0 018 0z" />
                        </svg>
                        <span>Invigilators</span>
                    </router-link>

                    <router-link v-if="currentUser"
                        :to="currentUser.role !== 'student' ? '/course_modules' : '/courses'"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700" :class="{
                            'bg-gray-900': $route.path === '/course_modules' || $route.path === '/courses'
                        }">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2" />
                        </svg>
                        <span>Course Modules</span>
                    </router-link>

                    <router-link v-if="currentUser && currentUser.role === 'admin'" to="/manage_institutions"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/manage_institutions' }">
                        <i class="fas fa-building mr-3"></i>
                        <span>Institutions</span>
                    </router-link>

                    <router-link to="/general_settings"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/general_settings' }">
                        <i class="fas fa-cog mr-3"></i>
                        <span>Settings</span>
                    </router-link>
                </nav>

                <div class="item-bottom flex flex-col p-4 mt-auto border-t border-gray-600">
                    <img class="max-w-35" src="/lob_favicon.png" alt="LOB EXAMS" />
                </div>
            </aside>

            <!-- Mobile Menu -->
            <aside v-if="mobileMenuOpen"
                class="fixed inset-0 z-40 md:hidden bg-gray-800 border-t border-gray-700 mt-16">
                <nav class="flex-1 p-4 space-y-2">
                    <router-link to="/dashboard"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/dashboard' }" @click="mobileMenuOpen = false">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6" />
                        </svg>
                        <span>Dashboard</span>
                    </router-link>

                    <router-link to="/schedule_exams"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/schedule_exams' }" @click="mobileMenuOpen = false">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z" />
                        </svg>
                        <span>Schedule Exams</span>
                    </router-link>

                    <router-link to="/invigilators"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/invigilators' }" @click="mobileMenuOpen = false">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M12 4.354a4 4 0 110 5.292M15 21H3v-1a6 6 0 0112 0v1zm0 0h6v-1a6 6 0 00-9-5.197M13 7a4 4 0 11-8 0 4 4 0 018 0z" />
                        </svg>
                        <span>Invigilators</span>
                    </router-link>

                    <router-link to="/rooms"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/rooms' }" @click="mobileMenuOpen = false">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M19 21V5a2 2 0 00-2-2H7a2 2 0 00-2 2v16m14 0h2m-2 0h-5m-9 0H3m2 0h5M9 7h1m-1 4h1m4-4h1m-1 4h1m-5 10v-5a1 1 0 011-1h2a1 1 0 011 1v5m-4 0h4" />
                        </svg>
                        <span>Rooms</span>
                    </router-link>

                    <router-link to="/course_modules"
                        class="flex items-center space-x-2 px-3 py-2 rounded text-gray-300 hover:bg-gray-700"
                        :class="{ 'bg-gray-900': $route.path === '/course_modules' }" @click="mobileMenuOpen = false">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2" />
                        </svg>
                        <span>Course Modules</span>
                    </router-link>
                </nav>
            </aside>

            <!-- Main Content -->
            <main class="w-full flex-1 overflow-y-auto p-6 bg-gray-900">
                <div v-if="currentUser" class="w-full flex-1 max-h-[90vh] container mx-auto px-4 py-8">
                    <router-view :current-user="currentUser" />
                </div>
            </main>
        </div>
    </div>
</template>

<script>
export default {
    name: 'AppLayout',
    data() {
        return {
            mobileMenuOpen: false,
            settingsDropdownOpen: false,
            currentUser: null,
            currentPage: 'dashboard'
        }
    },
    mounted() {
        const storedUser = localStorage.getItem("current_user");
        const token = localStorage.getItem("token");

        if (storedUser && token) {
            try {
                this.currentUser = JSON.parse(storedUser);
                console.log("Logged in user:", this.currentUser);
                console.log("Token:", token);
            } catch (error) {
                console.error("Error parsing user:", error);
                this.$router.push("/users/log_in");
            }
        } else {
            console.warn("No user or token found. Redirecting to login...");
            this.$router.push("/users/log_in");
        }
    },
    methods: {
        logout() {
            localStorage.removeItem("token");
            localStorage.removeItem("current_user");
            this.settingsDropdownOpen = false;
            this.$router.push('/users/log_in');
        }
    },
    watch: {
        $route(to) {
            this.currentPage = to.name || to.path.split('/')[1] || 'dashboard';
            this.mobileMenuOpen = false;
        }
    }
}
</script>