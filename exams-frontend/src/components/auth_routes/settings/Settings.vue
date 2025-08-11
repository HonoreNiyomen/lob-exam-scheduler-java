<template>
  <main>
    <div
      v-if="currentUser"
    >
      <!-- Main Content 9-->
      <Suspense>
        <component :is="componentForRole" :current-user="currentUser" />
        <template #fallback>
          <div class="text-gray-500 text-center py-4">Loading...</div>
        </template>
      </Suspense>
    </div>

    <div v-else class="flex flex-col items-center justify-center h-screen">
      <h1 class="text-2xl font-bold">Unauthorized</h1>
      <p class="text-gray-500">
        You do not have permission to access this page.
      </p>
    </div>
  </main>
</template>

<script>
import { defineAsyncComponent } from "vue";

export default {
  props: {
    currentUser: {
      type: Object,
      required: true,
    },
  },
  computed: {
    componentForRole() {
      console.log("Current user role:", this.currentUser?.role);
      switch (this.currentUser?.role) {
        case "admin":
          return defineAsyncComponent(
            () => import("./Admin.vue")
          );
        case "university":
          return defineAsyncComponent(
            () => import("./Institution.vue")
          );
        default:
          return defineAsyncComponent(() => import("./Default.vue"));
      }
    },
  },
};
</script>
