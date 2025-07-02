<template>
    <div class="container mx-auto px-4 py-8 text-gray-100">
        <!-- Hero Section -->
        <div class="text-center mb-12">
            <h1 class="text-4xl font-bold mb-4 text-indigo-400">Developer Documentation</h1>
            <p class="text-xl text-gray-400 max-w-3xl mx-auto">
                Resources for developers working with the LOB Exam Scheduler system
            </p>
        </div>

        <!-- Getting Started -->
        <section class="bg-gray-800 rounded-xl p-8 shadow-lg mb-12">
            <header class="flex items-center mb-6">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-green-600/20 p-2 rounded-lg mr-3">
                        <CheckIcon class="h-6 w-6 text-green-400" />
                    </span>
                    Getting Started
                </h2>
            </header>
            <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                <!-- Installation Card -->
                <div class="bg-gray-700/50 rounded-lg p-6">
                    <h3 class="text-xl font-semibold text-white mb-4 flex items-center">
                        <TerminalIcon class="h-5 w-5 text-blue-400 mr-2" />
                        Installation
                    </h3>
                    <div class="bg-black rounded-md p-4 mb-4 overflow-x-auto">
                        <pre class="text-green-400 text-sm font-mono whitespace-pre"># Clone the repository
git clone https://github.com/HonoreNiyomen/lob-exam-scheduler.git
cd lob-exam-scheduler

# Install dependencies
mix setup

# Start the server
mix phx.server</pre>
                    </div>
                    <p class="text-gray-400 text-sm">
                        For development with IEx: <span class="font-mono text-blue-400">iex -S mix phx.server</span>
                    </p>
                </div>

                <!-- Configuration Card -->
                <div class="bg-gray-700/50 rounded-lg p-6">
                    <h3 class="text-xl font-semibold text-white mb-4 flex items-center">
                        <CogIcon class="h-5 w-5 text-purple-400 mr-2" />
                        Configuration
                    </h3>
                    <div class="space-y-4">
                        <div>
                            <h4 class="text-gray-300 font-medium mb-1">Database Setup</h4>
                            <p class="text-gray-400 text-sm">
                                Configure PostgreSQL connection in <span
                                    class="font-mono text-blue-400">config/dev.exs</span>
                            </p>
                        </div>
                        <div>
                            <h4 class="text-gray-300 font-medium mb-1">Environment Variables</h4>
                            <p class="text-gray-400 text-sm">Create <span class="font-mono text-blue-400">.env</span>
                                file for secrets:</p>
                            <div class="bg-black rounded-md p-3 mt-2">
                                <pre class="text-yellow-400 text-xs font-mono whitespace-pre">DATABASE_URL=postgres://user:pass@localhost:5432/lob_exam_dev
SECRET_KEY_BASE=your_secret_key_here</pre>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- API Documentation -->
        <section class="bg-gray-800 rounded-xl p-8 shadow-lg mb-12">
            <header class="flex items-center mb-6">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-blue-600/20 p-2 rounded-lg mr-3">
                        <ApiIcon class="h-6 w-6 text-blue-400" />
                    </span>
                    API Endpoints
                </h2>
            </header>
            <div class="space-y-6">
                <ApiEndpoint method="GET" url="/api/exams" description="List all exams" :example="exampleGet" />
                <ApiEndpoint method="POST" url="/api/exams" description="Create new exam" :example="examplePost" />
            </div>
        </section>

        <!-- Tech Stack -->
        <section class="bg-gray-800 rounded-xl p-8 shadow-lg">
            <header class="flex items-center mb-6">
                <h2 class="text-2xl font-bold text-white flex items-center">
                    <span class="bg-yellow-600/20 p-2 rounded-lg mr-3">
                        <StackIcon class="h-6 w-6 text-yellow-400" />
                    </span>
                    Technology Stack
                </h2>
            </header>
            <div class="grid grid-cols-2 md:grid-cols-3 gap-4">
                <div v-for="(color, tech) in techStack" :key="tech"
                    :class="`${color} border py-3 px-4 rounded-lg text-center font-medium flex items-center justify-center`">
                    {{ tech }}
                </div>
            </div>
        </section>
    </div>
</template>

<script setup>
import { ref } from 'vue'
import ApiEndpoint from './ApiEndpoint.vue'
import { CheckIcon, TerminalIcon, CogIcon, ApiIcon, StackIcon } from 'lucide-vue-next'

const exampleGet = `{
  "data": [
    {
      "id": 1,
      "name": "Mathematics Final",
      "date": "2023-05-15",
      "room": "A-204"
    }
  ]
}`

const examplePost = `{
  "exam": {
    "name": "Chemistry Midterm",
    "date": "2023-06-10",
    "room_id": 3
  }
}`

const techStack = {
    Elixir: 'bg-purple-900/30 text-purple-400 border-purple-500/30',
    Phoenix: 'bg-red-900/30 text-red-400 border-red-500/30',
    LiveView: 'bg-blue-900/30 text-blue-400 border-blue-500/30',
    PostgreSQL: 'bg-indigo-900/30 text-indigo-400 border-indigo-500/30',
    Tailwind: 'bg-cyan-900/30 text-cyan-400 border-cyan-500/30',
    Oban: 'bg-yellow-900/30 text-yellow-400 border-yellow-500/30',
    Swoosh: 'bg-green-900/30 text-green-400 border-green-500/30',
    Ecto: 'bg-gray-900/30 text-gray-400 border-gray-500/30'
}
</script>

<style scoped>
pre {
    white-space: pre-wrap;
}
</style>
