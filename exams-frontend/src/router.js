import { createRouter, createWebHistory } from "vue-router";

// Import your components for routes
import UnAuthRoot from "./layouts/UnAuthRoot.vue";
import AuthRoot from "./layouts/AuthRoot.vue";
import Dashboard from "./components/Dashboard.vue";
import Home from "./components/LandingPage.vue";
import Signin from "./components/SigninPage.vue";
import Signup from "./components/SignupPage.vue";
import Features from "./components/Features.vue";
import Developers from "./components/Developers.vue";
import Contact from "./components/Contact.vue";

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

      {
        path: "/features",
        name: "Features Page",
        component: Features,
      },
      {
        path: "/developers",
        name: "Developers Page",
        component: Developers,
      },
      {
        path: "/contact",
        name: "Contact Page",
        component: Contact,
      },
    ],
  },
  {
  path: "/dashboard",
    component: AuthRoot,
    children: [
      {
        path: "",
        name: "Dashboard",
        component: Dashboard,
      },
    ],},
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
