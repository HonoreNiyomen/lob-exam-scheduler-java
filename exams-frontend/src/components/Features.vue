<template>
    <div class="container mx-auto px-4 py-8 text-gray-100">
        <section class="mb-16">
            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                <!-- Feature Card 1 -->
                <div class="bg-gray-800 rounded-xl p-6 shadow-lg hover:bg-gray-700/50 transition-colors">
                    <div class="flex items-center mb-4">
                        <div class="bg-green-600/20 p-2 rounded-lg mr-3">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-green-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M5 13l4 4L19 7" />
                            </svg>
                        </div>
                        <h3 class="text-xl font-semibold text-white">Secure Authentication</h3>
                    </div>
                    <p class="text-gray-400">Role-based access control for students and administrators with secure
                        login.</p>
                </div>

                <!-- Feature Card 2 -->
                <div class="bg-gray-800 rounded-xl p-6 shadow-lg hover:bg-gray-700/50 transition-colors">
                    <div class="flex items-center mb-4">
                        <div class="bg-blue-600/20 p-2 rounded-lg mr-3">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-blue-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M5 13l4 4L19 7" />
                            </svg>
                        </div>
                        <h3 class="text-xl font-semibold text-white">Admin Dashboard</h3>
                    </div>
                    <p class="text-gray-400">Comprehensive interface for managing subjects, rooms, students, and
                        lecturers.</p>
                </div>

                <!-- Feature Card 3 -->
                <div class="bg-gray-800 rounded-xl p-6 shadow-lg hover:bg-gray-700/50 transition-colors">
                    <div class="flex items-center mb-4">
                        <div class="bg-purple-600/20 p-2 rounded-lg mr-3">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-purple-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M5 13l4 4L19 7" />
                            </svg>
                        </div>
                        <h3 class="text-xl font-semibold text-white">Real-time Timetable</h3>
                    </div>
                    <p class="text-gray-400">Live-updating exam schedules powered by Phoenix LiveView with no page
                        reloads.</p>
                </div>
            </div>
        </section>

        <!-- Tech Stack Section (if needed) -->
        <section class="mt-12">
            <h2 class="text-2xl font-bold mb-6 text-white">Tech Stack</h2>
            <div class="flex flex-wrap gap-3">
                <span class="px-4 py-2 rounded-full bg-purple-900/30 text-purple-400">Elixir</span>
                <span class="px-4 py-2 rounded-full bg-red-900/30 text-red-400">Phoenix</span>
                <span class="px-4 py-2 rounded-full bg-blue-900/30 text-blue-400">LiveView</span>
                <span class="px-4 py-2 rounded-full bg-indigo-900/30 text-indigo-400">PostgreSQL</span>
                <span class="px-4 py-2 rounded-full bg-cyan-900/30 text-cyan-400">Tailwind</span>
                <span class="px-4 py-2 rounded-full bg-yellow-900/30 text-yellow-400">Oban</span>
            </div>
        </section>
    </div>
</template>