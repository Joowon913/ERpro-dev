import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import LoginPage  from './components/views/pages/LoginPage/LoginPage';
import MainPage from './components/views/pages/MainPage/MainPage';
import ProfilePage from './components/views/pages/ProfilePage/ProfilePage'

function App() {
  return (
    <div>
      <BrowserRouter>
          <Routes>
          	<Route path="login" element={<LoginPage/>}/>
            <Route path="" element={<MainPage/>}/>
            <Route path="profile" element={<ProfilePage/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
