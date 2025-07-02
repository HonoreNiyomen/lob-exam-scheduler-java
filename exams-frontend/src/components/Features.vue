<template>
    <div class="container mx-auto px-4 py-8 text-gray-100">
        <!-- Header Section -->
        <div class="text-center mb-12">
            <h1 class="text-4xl font-bold mb-4 text-indigo-400">LOB Exam Scheduler Features</h1>
            <p class="text-xl text-gray-400 max-w-3xl mx-auto">
                Powerful exam management tools built with Elixir and Phoenix LiveView
            </p>
        </div>

        <!-- Current Features -->
        <section class="mb-16">
            <div class="flex items-center mb-8">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-indigo-600/20 p-2 rounded-lg mr-3">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-indigo-400" fill="none"
                            viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 13l4 4L19 7" />
                        </svg>
                    </span>
                    Current Features
                </h2>
            </div>

            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                <FeatureCard iconColor="green-400" bgColor="bg-green-600/20" title="Secure Authentication"
                    desc="Role-based access control for students and administrators with secure login." />
                <FeatureCard iconColor="blue-400" bgColor="bg-blue-600/20" title="Admin Dashboard"
                    desc="Comprehensive interface for managing subjects, rooms, students, and lecturers." />
                <FeatureCard iconColor="purple-400" bgColor="bg-purple-600/20" title="Real-time Timetable"
                    desc="Live-updating exam schedules powered by Phoenix LiveView with no page reloads." />
            </div>
        </section>

        <!-- Upcoming Features -->
        <section class="mb-16">
            <div class="flex items-center mb-8">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-yellow-600/20 p-2 rounded-lg mr-3">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-yellow-400" fill="none"
                            viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M13 10V3L4 14h7v7l9-11h-7z" />
                        </svg>
                    </span>
                    Upcoming Features
                </h2>
            </div>

            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                <FeatureCard iconColor="red-400" bgColor="bg-red-600/20" title="Conflict Detection"
                    desc="Automatic detection of room clashes and double-booked students or staff." border />
                <FeatureCard iconColor="indigo-400" bgColor="bg-indigo-600/20" title="Exam Notifications"
                    desc="Email and browser notifications before exam dates using Oban and Swoosh." border />
                <FeatureCard iconColor="green-400" bgColor="bg-green-600/20" title="Export Options"
                    desc="Export schedules in PDF/CSV format and integrate with calendar services." border />
            </div>
        </section>

        <!-- Tech Stack -->
        <section>
            <div class="flex items-center mb-8">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-gray-600/20 p-2 rounded-lg mr-3">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 text-gray-400" fill="none"
                            viewBox="0 0 24 24" stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0..." />
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M15 12a3 3 0 11-6 0 3 3 0 016 0z" />
                        </svg>
                    </span>
                    Technology Stack
                </h2>
            </div>
            <div class="grid grid-cols-2 md:grid-cols-3 lg:grid-cols-6 gap-4">
                <div v-for="(tech, index) in techStack" :key="index" :class="tech.bg"
                    class="py-3 px-4 rounded-lg text-center font-medium">
                    {{ tech.name }}
                </div>
            </div>
        </section>
    </div>
</template>

<script>
export default {
    name: 'FeaturesPage',
    components: {
        FeatureCard: {
            props: ['title', 'desc', 'iconColor', 'bgColor', 'border'],
            template: `
        <div :class="['bg-gray-800 rounded-xl p-6 shadow-lg transition-colors', border ? 'border border-gray-700' : 'hover:bg-gray-700/50']">
          <div class="flex items-center mb-4">
            <div :class="[bgColor, 'p-2 rounded-lg mr-3']">
              <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" :class="'text-' + iconColor" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 13l4 4L19 7" />
              </svg>
            </div>
            <h3 class="text-xl font-semibold text-white">{{ title }}</h3>
          </div>
          <p class="text-gray-400">
            {{ desc }}
          </p>
        </div>
      `
        }
    },
    data() {
        return {
            techStack: [
                { name: 'Elixir', bg: 'bg-purple-900/30 text-purple-400' },
                { name: 'Phoenix', bg: 'bg-red-900/30 text-red-400' },
                { name: 'LiveView', bg: 'bg-blue-900/30 text-blue-400' },
                { name: 'PostgreSQL', bg: 'bg-indigo-900/30 text-indigo-400' },
                { name: 'Tailwind', bg: 'bg-cyan-900/30 text-cyan-400' },
                { name: 'Oban', bg: 'bg-yellow-900/30 text-yellow-400' }
            ]
        }
    }
}
</script>

<style scoped></style>
