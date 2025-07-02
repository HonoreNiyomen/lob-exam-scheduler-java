import { defineConfig } from "vite";
import vue from "@vitejs/plugin-vue";
import Inspect from "vite-plugin-inspect";

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue(), Inspect()],
  server: {
    proxy: {
      "/api": "http://localhost:8080",
    },
  },
});
