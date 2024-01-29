import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import LoginPage from "./components/views/pages/LoginPage/LoginPage";
import FindPasswordPage from "./components/views/pages/FindPasswordPage/FindPasswordPage";
import MainPage from "./components/views/pages/MainPage/MainPage";
import ProfilePage from "./components/views/pages/ProfilePage/ProfilePage";
import Navbar from "./components/views/Header/Navbar";
import AddModal from "./components/views/commons/Modal/AddModal";
import UpdateModal from "./components/views/commons/Modal/UpdateModal";
import OrderPage from "./components/views/pages/OrderPage/OrderPage";
import OrderAdd from "./components/views/pages/OrderPage/OrderAdd";
import OrderAddDataTable from "./components/views/pages/OrderPage/OrderAddDataTable";
import DataTable from "./components/views/pages/MainPage/DataTable";
import EstimateAdd from "./components/views/pages/EstimatePage/EstimateAdd";
import AccountPage from "./components/views/pages/AccountPage/AccountPage";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="login" element={<LoginPage />} />
          <Route path="findpassword" element={<FindPasswordPage />} />
          <Route path="/" element={<MainPage />} />
          <Route path="/profile" element={<ProfilePage />} />
          <Route path="/account" element={<AccountPage />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
