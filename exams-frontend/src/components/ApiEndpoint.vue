<template>
  <div class="bg-gray-700/50 rounded-lg p-6">
    <div class="flex flex-col md:flex-row md:items-center md:justify-between mb-3">
      <div class="flex items-center">
        <span :class="methodColor" class="px-2 py-1 text-xs font-mono rounded mr-3">{{ method }}</span>
        <h3 class="text-lg font-semibold text-white">{{ url }}</h3>
      </div>
      <span class="text-gray-400 text-sm mt-1 md:mt-0">{{ description }}</span>
    </div>
    <div class="bg-black rounded-md p-4">
      <pre class="text-gray-300 text-sm font-mono whitespace-pre">{{ example }}</pre>
    </div>
  </div>
</template>

<script setup>
import { computed } from 'vue'

defineProps({
  method: { type: String, required: true },
  url: { type: String, required: true },
  description: { type: String, required: true },
  example: { type: String, required: true }
})

const methodColor = computed(() => {
  switch (props.method.toUpperCase()) {
    case 'GET':
      return 'bg-green-600/20 text-green-400'
    case 'POST':
      return 'bg-indigo-600/20 text-indigo-400'
    case 'PUT':
      return 'bg-yellow-600/20 text-yellow-400'
    case 'DELETE':
      return 'bg-red-600/20 text-red-400'
    default:
      return 'bg-gray-600/20 text-gray-400'
  }
})
</script>
