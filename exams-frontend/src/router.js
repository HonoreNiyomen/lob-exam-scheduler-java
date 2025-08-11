import { createRouter, createWebHistory } from "vue-router";

// Import your components for routes
import UnAuthRoot from "./layouts/UnAuthRoot.vue";
import AuthRoot from "./layouts/AuthRoot.vue";
import Dashboard from "./components/auth_routes/dashboard/Dashboard.vue";
import Home from "./components/LandingPage.vue";
import Signin from "./components/SigninPage.vue";
import Signup from "./components/SignupPage.vue";
import Features from "./components/Features.vue";
import Developers from "./components/Developers.vue";
import Contact from "./components/Contact.vue";
import ExamSchedules from "./components/auth_routes/exam_schedules/Exams.vue";
import Rooms from "./components/auth_routes/rooms/Rooms.vue";
import Invigilators from "./components/auth_routes/invigilators/Invigilators.vue";
import CourseModules from "./components/auth_routes/course_modules/Courses.vue";
import ManageInstitutions from "./components/auth_routes/manage_institutions/Institutions.vue";
import Settings from "./components/auth_routes/settings/Settings.vue";

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
        path: "users/log_in",
        name: "Signin Page",
        component: Signin,
      },
      {
        path: "users/register",
        name: "Signup Page",
        component: Signup,
      },

      {
        path: "features",
        name: "Features Page",
        component: Features,
      },
      {
        path: "developers",
        name: "Developers Page",
        component: Developers,
      },
      {
        path: "contact",
        name: "Contact Page",
        component: Contact,
      },
    ],
  },
  {
    path: "/u",
    component: AuthRoot,
    children: [
      {
        path: "dashboard",
        name: "Dashboard",
        component: Dashboard,
        props: true,
      },
      {
        path: "exam_schedule",
        name: "Exam Schedules",
        component: ExamSchedules,
        props: true,
      },
      {
        path: "rooms",
        name: "Rooms",
        component: Rooms,
        props: true,
      },
      {
        path: "invigilators",
        name: "Invigilators",
        component: Invigilators,
        props: true,
      },
      {
        path: "course_modules",
        name: "Course Modules",
        component: CourseModules,
        props: true,
      },
      {
        path: "manage_institutions",
        name: "Manage Institutions",
        component: ManageInstitutions,
        props: true,
      },
      {
        path: "general_settings",
        name: "Account Settings",
        component: Settings,
        props: true,
      },
    ],
  },
  {
  path: '/:pathMatch(.*)*',
  name: 'NotFound',
  component: () => import('./layouts/errors/404.vue'),
},
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
