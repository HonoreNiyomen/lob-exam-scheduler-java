<template>
    <!-- Hero Section -->
    <header class="bg-gradient-to-br from-gray-800 to-gray-900 w-full">
        <div class="w-full py-24 px-4 sm:px-6 lg:px-8 text-center">
            <h1 class="text-4xl md:text-6xl font-extrabold tracking-tight text-white">
                Smart Exam Scheduling Tool
            </h1>
            <p class="mt-6 max-w-4xl mx-auto text-xl text-gray-300">
                ExamFlow eliminates scheduling conflicts and simplifies exam management with real-time capabilities.
            </p>
            <div class="mt-10 flex justify-center space-x-4">
                <a href="/users/register"
                    class="px-8 py-3 border border-transparent text-base font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 md:py-4 md:text-lg md:px-10">
                    Get Started
                </a>
                <a href="/features"
                    class="px-8 py-3 border border-transparent text-base font-medium rounded-md text-indigo-100 bg-indigo-900 hover:bg-indigo-800 md:py-4 md:text-lg md:px-10">
                    Learn More
                </a>
            </div>
        </div>
    </header>

    <!-- Features Section -->
    <section id="features" class="py-20 bg-gray-900 w-full">
        <div class="w-full px-4 sm:px-6 lg:px-8">
            <div class="text-center">
                <h2 class="text-3xl font-extrabold text-white sm:text-4xl">
                    Powerful Features for Seamless Exam Management
                </h2>
            </div>

            <div class="mt-16 grid gap-6 sm:gap-8 lg:gap-10 grid-cols-1 md:grid-cols-2 lg:grid-cols-3 px-4 lg:px-12">
                <!-- Feature 1 -->
                <div class="bg-gray-800 rounded-lg p-6 lg:p-8 hover:bg-gray-700 transition duration-300">
                    <div class="flex items-center justify-center h-12 w-12 rounded-md bg-indigo-500 text-white">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2" />
                        </svg>
                    </div>
                    <h3 class="mt-6 text-lg font-medium text-white">Conflict-Free Scheduling</h3>
                    <p class="mt-2 text-base text-gray-400">
                        Our system automatically detects and prevents scheduling conflicts between rooms, invigilators,
                        and students.
                    </p>
                </div>

                <!-- Feature 2 -->
                <div class="bg-gray-800 rounded-lg p-6 lg:p-8 hover:bg-gray-700 transition duration-300">
                    <div class="flex items-center justify-center h-12 w-12 rounded-md bg-indigo-500 text-white">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z" />
                        </svg>
                    </div>
                    <h3 class="mt-6 text-lg font-medium text-white">Real-Time Updates</h3>
                    <p class="mt-2 text-base text-gray-400">
                        Phoenix LiveView ensures students and staff see schedule changes instantly without page reloads.
                    </p>
                </div>

                <!-- Feature 3 -->
                <div class="bg-gray-800 rounded-lg p-6 lg:p-8 hover:bg-gray-700 transition duration-300">
                    <div class="flex items-center justify-center h-12 w-12 rounded-md bg-indigo-500 text-white">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9" />
                        </svg>
                    </div>
                    <h3 class="mt-6 text-lg font-medium text-white">Custom Notifications</h3>
                    <p class="mt-2 text-base text-gray-400">
                        Students can opt to receive reminders for upcoming exams via email or in-app notifications.
                    </p>
                </div>
            </div>
        </div>
    </section>

    <!-- How It Works Section -->
    <section class="py-20 bg-gray-800 w-full">
        <div class="w-full px-4 sm:px-6 lg:px-8">
            <div class="text-center">
                <h2 class="text-3xl font-extrabold text-white sm:text-4xl">
                    Simple Yet Powerful Workflow
                </h2>
                <p class="mt-4 max-w-3xl text-xl text-gray-400 mx-auto">
                    Designed for both administrators and students
                </p>
            </div>

            <div class="mt-16 px-4 lg:px-12">
                <div class="grid md:grid-cols-2 gap-8 items-start">
                    <div>
                        <div class="bg-gray-700 p-6 lg:p-8 rounded-lg h-full">
                            <h3 class="text-2xl font-bold text-white">For Administrators</h3>
                            <ul class="mt-6 space-y-4">
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Easily assign subjects, rooms, and
                                        invigilators
                                    </p>
                                </li>
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Automatic conflict detection prevents
                                        overlaps
                                    </p>
                                </li>
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Generate reports and analytics with one
                                        click
                                    </p>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div>
                        <div class="bg-gray-700 p-6 lg:p-8 rounded-lg h-full">
                            <h3 class="text-2xl font-bold text-white">For Students</h3>
                            <ul class="mt-6 space-y-4">
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Personalized exam timetable in real-time</p>
                                </li>
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Get notified of schedule changes instantly
                                    </p>
                                </li>
                                <li class="flex items-start">
                                    <div class="flex-shrink-0 h-6 w-6 text-indigo-400 mt-0.5">
                                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                            stroke="currentColor">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M5 13l4 4L19 7" />
                                        </svg>
                                    </div>
                                    <p class="ml-3 text-base text-gray-400">Option to receive exam reminders</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- CTA Section -->
    <section class="bg-indigo-700 w-full">
        <div class="w-full py-12 px-4 sm:px-6 lg:px-8 lg:py-24">
            <div class="text-center">
                <h2 class="text-3xl font-extrabold tracking-tight text-white sm:text-4xl">
                    <span class="block">Ready to transform your exam scheduling?</span>
                </h2>
                <p class="mt-4 max-w-3xl text-xl text-indigo-100 mx-auto">
                    Join institutions that have eliminated scheduling headaches with ExamFlow.
                </p>
                <div class="mt-8 flex flex-col sm:flex-row justify-center gap-4">
                    <div class="inline-flex rounded-md shadow">
                        <a href="/users/register"
                            class="inline-flex items-center justify-center px-8 py-3 border border-transparent text-base font-medium rounded-md text-indigo-600 bg-white hover:bg-indigo-50 transition duration-200">
                            Get Started Today
                        </a>
                    </div>
                    <div class="inline-flex">
                        <a href="/contact"
                            class="inline-flex items-center justify-center px-8 py-3 border border-transparent text-base font-medium rounded-md text-white bg-indigo-800 hover:bg-indigo-700 transition duration-200">
                            Request Demo
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</template>