import { createRouter, createWebHistory } from "vue-router";

// Import your components for routes
import UnAuthRoot from "./layouts/UnAuthRoot.vue";
import Home from "./components/LandingPage.vue";
import Signin from "./components/SigninPage.vue";
import Signup from "./components/SignupPage.vue";

const routes = [
  {
    path: "/",
    component: UnAuthRoot,
    children: [
      {
        path: "",
        name: "Landing",
        component: Home,
      },
      {
        path: "/users/log_in",
        name: "Signin Page",
        component: Signin,
      },
      {
        path: "/users/register",
        name: "Signup Page",
        component: Signup,
      },
    ],
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
