<template>
    <!-- contact.html.heex -->
    <div class="container mx-auto px-4 py-8 text-gray-100 max-w-4xl">
        <!-- Header Section -->
        <div class="text-center mb-12">
            <h1 class="text-4xl font-bold mb-4 text-indigo-400">Contact Us</h1>
            <p class="text-xl text-gray-400">
                Have questions about the LOB Exam Scheduler? We're here to help.
            </p>
        </div>

        <div class="grid grid-cols-1 md:grid-cols-2 gap-8 mb-12">
            <!-- Contact Information -->
            <div class="bg-gray-800 rounded-xl p-8 shadow-lg">
                <h2 class="text-2xl font-bold text-white mb-6 flex items-center">
                    <span class="bg-blue-600/20 p-2 rounded-lg mr-3">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-blue-400" fill="none"
                            viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M3 5a2 2 0 012-2h3.28a1 1 0 01.948.684l1.498 4.493a1 1 0 01-.502 1.21l-2.257 1.13a11.042 11.042 0 005.516 5.516l1.13-2.257a1 1 0 011.21-.502l4.493 1.498a1 1 0 01.684.949V19a2 2 0 01-2 2h-1C9.716 21 3 14.284 3 6V5z" />
                        </svg>
                    </span>
                    Contact Information
                </h2>

                <div class="space-y-6">
                    <!-- Email -->
                    <div class="flex items-start">
                        <div class="bg-indigo-600/10 p-2 rounded-lg mr-4">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 text-indigo-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M3 8l7.89 5.26a2 2 0 002.22 0L21 8M5 19h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v10a2 2 0 002 2z" />
                            </svg>
                        </div>
                        <div>
                            <h3 class="text-lg font-semibold text-white mb-1">Email</h3>
                            <p class="text-gray-400">support@lob-exams.edu</p>
                        </div>
                    </div>

                    <!-- Phone -->
                    <div class="flex items-start">
                        <div class="bg-green-600/10 p-2 rounded-lg mr-4">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 text-green-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M3 5a2 2 0 012-2h3.28a1 1 0 01.948.684l1.498 4.493a1 1 0 01-.502 1.21l-2.257 1.13a11.042 11.042 0 005.516 5.516l1.13-2.257a1 1 0 011.21-.502l4.493 1.498a1 1 0 01.684.949V19a2 2 0 01-2 2h-1C9.716 21 3 14.284 3 6V5z" />
                            </svg>
                        </div>
                        <div>
                            <h3 class="text-lg font-semibold text-white mb-1">Phone</h3>
                            <p class="text-gray-400">+1 (555) 123-4567</p>
                        </div>
                    </div>

                    <!-- Address -->
                    <div class="flex items-start">
                        <div class="bg-yellow-600/10 p-2 rounded-lg mr-4">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 text-yellow-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                            </svg>
                        </div>
                        <div>
                            <h3 class="text-lg font-semibold text-white mb-1">Address</h3>
                            <p class="text-gray-400">123 University Avenue</p>
                            <p class="text-gray-400">Exam City, EC 12345</p>
                        </div>
                    </div>

                    <!-- Hours -->
                    <div class="flex items-start">
                        <div class="bg-purple-600/10 p-2 rounded-lg mr-4">
                            <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5 text-purple-400" fill="none"
                                viewBox="0 0 24 24" stroke="currentColor">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                    d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z" />
                            </svg>
                        </div>
                        <div>
                            <h3 class="text-lg font-semibold text-white mb-1">Support Hours</h3>
                            <p class="text-gray-400">Monday - Friday: 8:00 AM - 5:00 PM</p>
                            <p class="text-gray-400">Saturday: 9:00 AM - 1:00 PM</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Contact Form -->
            <div class="bg-gray-800 rounded-xl p-8 shadow-lg">
                <h2 class="text-2xl font-bold text-white mb-6 flex items-center">
                    <span class="bg-indigo-600/20 p-2 rounded-lg mr-3">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-indigo-400" fill="none"
                            viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M8 10h.01M12 10h.01M16 10h.01M9 16H5a2 2 0 01-2-2V6a2 2 0 012-2h14a2 2 0 012 2v8a2 2 0 01-2 2h-5l-5 5v-5z" />
                        </svg>
                    </span>
                    Send Us a Message
                </h2>

                <form class="space-y-6">
                    <!-- Name -->
                    <div>
                        <label for="name" class="block text-sm font-medium text-gray-300 mb-1">Full Name</label>
                        <input type="text" id="name" name="name"
                            class="w-full bg-gray-700 border border-gray-600 rounded-lg px-4 py-2 text-white focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500">
                    </div>

                    <!-- Email -->
                    <div>
                        <label for="email" class="block text-sm font-medium text-gray-300 mb-1">Email Address</label>
                        <input type="email" id="email" name="email"
                            class="w-full bg-gray-700 border border-gray-600 rounded-lg px-4 py-2 text-white focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500">
                    </div>

                    <!-- Subject -->
                    <div>
                        <label for="subject" class="block text-sm font-medium text-gray-300 mb-1">Subject</label>
                        <select id="subject" name="subject"
                            class="w-full bg-gray-700 border border-gray-600 rounded-lg px-4 py-2 text-white focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500">
                            <option value="" disabled selected>Select a subject</option>
                            <option value="support">Technical Support</option>
                            <option value="feature">Feature Request</option>
                            <option value="bug">Bug Report</option>
                            <option value="other">Other Inquiry</option>
                        </select>
                    </div>

                    <!-- Message -->
                    <div>
                        <label for="message" class="block text-sm font-medium text-gray-300 mb-1">Message</label>
                        <textarea id="message" name="message" rows="4"
                            class="w-full bg-gray-700 border border-gray-600 rounded-lg px-4 py-2 text-white focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500"></textarea>
                    </div>

                    <!-- Submit Button -->
                    <button type="submit"
                        class="w-full bg-indigo-600 hover:bg-indigo-700 text-white font-medium py-2 px-4 rounded-lg transition-colors">
                        Send Message
                    </button>
                </form>
            </div>
        </div>

        <!-- FAQ Section -->
        <div class="bg-gray-800 rounded-xl p-8 shadow-lg">
            <h2 class="text-2xl font-bold text-white mb-6 flex items-center">
                <span class="bg-yellow-600/20 p-2 rounded-lg mr-3">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-yellow-400" fill="none"
                        viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M8.228 9c.549-1.165 2.03-2 3.772-2 2.21 0 4 1.343 4 3 0 1.4-1.278 2.575-3.006 2.907-.542.104-.994.54-.994 1.093m0 3h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                    </svg>
                </span>
                Frequently Asked Questions
            </h2>

            <div class="space-y-4">
                <!-- FAQ Item 1 -->
                <div class="border-b border-gray-700 pb-4">
                    <h3 class="text-lg font-semibold text-white mb-2">How do I reset my password?</h3>
                    <p class="text-gray-400">You can reset your password by clicking on the "Forgot Password" link on
                        the login page. A password reset link will be sent to your registered email address.</p>
                </div>

                <!-- FAQ Item 2 -->
                <div class="border-b border-gray-700 pb-4">
                    <h3 class="text-lg font-semibold text-white mb-2">Where can I find my exam schedule?</h3>
                    <p class="text-gray-400">After logging in, your personalized exam schedule will be displayed on your
                        dashboard. You can also view it under the "My Exams" section.</p>
                </div>

                <!-- FAQ Item 3 -->
                <div class="border-b border-gray-700 pb-4">
                    <h3 class="text-lg font-semibold text-white mb-2">How do I report a scheduling conflict?</h3>
                    <p class="text-gray-400">Please contact your department administrator immediately if you notice any
                        scheduling conflicts. You can also use the "Report Issue" feature in the system.</p>
                </div>

                <!-- FAQ Item 4 -->
                <div class="pt-4">
                    <h3 class="text-lg font-semibold text-white mb-2">Is there mobile access available?</h3>
                    <p class="text-gray-400">Yes, the LOB Exam Scheduler is fully responsive and works on mobile
                        devices. You can access all features through your mobile browser.</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script setup>
</script>
