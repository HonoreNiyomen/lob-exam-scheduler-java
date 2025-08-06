<template>
  <div class="container mx-auto px-4 py-8 text-gray-100">
    <!-- Hero Section -->
    <div class="text-center mb-12">
      <h1 class="text-4xl font-bold mb-4 text-indigo-400">
        Developer Documentation
      </h1>
      <p class="text-xl text-gray-400 max-w-3xl mx-auto">
        Resources for developers working with the LOB Exam Scheduler system
      </p>
    </div>

    <!-- Getting Started -->
    <section class="bg-gray-800 rounded-xl p-8 shadow-lg mb-12">
      <header class="flex items-center mb-6">
        <h2 class="text-2xl font-bold text-white flex items-center">
          <span class="bg-green-600/20 p-2 rounded-lg mr-3">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-6 w-6 text-green-400"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M5 13l4 4L19 7"
              />
            </svg>
          </span>
          Getting Started
        </h2>
      </header>
      <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
        <!-- Installation Card -->
        <div class="bg-gray-700/50 rounded-lg p-6">
          <h3 class="text-xl font-semibold text-white mb-4 flex items-center">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-5 w-5 text-blue-400 mr-2"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M8 9l3 3-3 3m5 0h3M5 20h14a2 2 0 002-2V6a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z"
              />
            </svg>
            Installation
          </h3>
          <div class="bg-black rounded-md p-4 mb-4 overflow-x-auto">
            <pre class="text-green-400 text-sm font-mono whitespace-pre">
# Clone the repository
git clone https://github.com/HonoreNiyomen/lob-exam-scheduler-java.git
cd lob-exam-scheduler-java

# Build and run Backend (Spring Boot)

./mvnw clean install
./mvnw spring-boot:run

# Build and run Frontend (Vue 3 + Vite)
cd exams-frontend

npm install
npm run dev</pre
            >
          </div>
        </div>

        <!-- Configuration Card -->
        <div class="bg-gray-700/50 rounded-lg p-6">
          <h3 class="text-xl font-semibold text-white mb-4 flex items-center">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-5 w-5 text-purple-400 mr-2"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z"
              />
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"
              />
            </svg>
            Configuration
          </h3>
          <div class="space-y-4">
            <div>
              <h4 class="text-gray-300 font-medium mb-1">
                Database & JWT Setup
              </h4>
              <p class="text-gray-400 text-sm">
                Configure connections in
                <span class="font-mono text-blue-400"
                  >src/main/resources/application.properties</span
                >
              </p>
            </div>
            <div>
              <h4 class="text-gray-300 font-medium mb-1">
                Environment Variables
              </h4>
              <p class="text-gray-400 text-sm">
                Create <span class="font-mono text-blue-400">.env</span> file
                for secrets:
              </p>
              <div class="bg-black rounded-md p-3 mt-2">
                <pre class="text-yellow-400 text-xs font-mono whitespace-pre">
EXAMS_DATABASE_URL="jdbc:postgresql://&lt;db_host>:&lt;db_port>/&lt;db_name>"

DB_USERNAME= &lt;your_db_username>

DB_PASSWORD= &lt;your_db_secret_key>

JWT_SECRET= &lt;your_jwt_secret_key>
</pre
                >
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
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-6 w-6 text-blue-400"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M13 10V3L4 14h7v7l9-11h-7z"
              />
            </svg>
          </span>
          API Endpoints
        </h2>
      </header>
      <div class="space-y-6">
        <!-- GET Endpoint -->
        <div class="bg-gray-700/50 rounded-lg p-6">
          <div class="flex items-center mb-3">
            <span
              class="bg-green-600/20 text-green-400 px-3 py-1 rounded-md text-sm font-mono mr-3"
              >GET</span
            >
            <span class="font-mono text-white">/api/exams</span>
          </div>
          <p class="text-gray-400 mb-4">List all exams</p>
          <div class="bg-black rounded-md p-4">
            <pre class="text-green-400 text-sm font-mono whitespace-pre">
{
  "data": [
    {
      "id": 1,
      "name": "Mathematics Final",
      "date": "2023-05-15",
      "room": "A-204"
    }
  ]
}</pre
            >
          </div>
        </div>

        <!-- POST Endpoint -->
        <div class="bg-gray-700/50 rounded-lg p-6">
          <div class="flex items-center mb-3">
            <span
              class="bg-blue-600/20 text-blue-400 px-3 py-1 rounded-md text-sm font-mono mr-3"
              >POST</span
            >
            <span class="font-mono text-white">/api/exams</span>
          </div>
          <p class="text-gray-400 mb-4">Create new exam</p>
          <div class="bg-black rounded-md p-4">
            <pre class="text-green-400 text-sm font-mono whitespace-pre">
{
  "exam": {
    "name": "Chemistry Midterm",
    "date": "2023-06-10",
    "room_id": 3
  }
}</pre
            >
          </div>
        </div>
      </div>
    </section>

    <!-- Tech Stack -->
    <section class="bg-gray-800 rounded-xl p-8 shadow-lg">
      <header class="flex items-center mb-6">
        <h2 class="text-2xl font-bold text-white flex items-center">
          <span class="bg-yellow-600/20 p-2 rounded-lg mr-3">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              class="h-6 w-6 text-yellow-400"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2"
                d="M19 11H5m14 0a2 2 0 012 2v6a2 2 0 01-2 2H5a2 2 0 01-2-2v-6a2 2 0 012-2m14 0V9a2 2 0 00-2-2M5 11V9a2 2 0 012-2m0 0V5a2 2 0 012-2h6a2 2 0 012 2v2M7 7h10"
              />
            </svg>
          </span>
          Tech Stack
        </h2>
      </header>
      <div class="grid grid-cols-2 md:grid-cols-4 gap-4">
        <div
          class="bg-emerald-900/20 text-emerald-400 border-emerald-500/30 border py-3 px-4 rounded-lg text-center font-medium flex items-center justify-center"
        >
          Vue 3 + Vite
        </div>

        <div
          class="bg-blue-900/20 text-blue-300 border-blue-500/30 border py-3 px-4 rounded-lg text-center font-medium flex items-center justify-center"
        >
          PostgreSQL
        </div>

        <div
          class="bg-amber-900/20 text-amber-300 border-amber-500/30 border py-3 px-4 rounded-lg text-center font-medium flex items-center justify-center"
        >
          Java + Spring Boot
        </div>

        <div
          class="bg-cyan-900/20 text-cyan-300 border-cyan-500/30 border py-3 px-4 rounded-lg text-center font-medium flex items-center justify-center"
        >
          Tailwind
        </div>
      </div>
    </section>
  </div>
</template>
