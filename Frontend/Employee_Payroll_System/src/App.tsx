import { useSelector } from "react-redux"
import { Navigate, Route, Routes } from "react-router-dom";

import { RootState } from "./redux/store";
import HomePage from "./pages/HomePage";
import LoginPage from "./pages/LoginPage";


function App() {

  const isAuthenticated = useSelector((state: RootState) => state.UserReducer.isAuthenticated);


  return (
    <>
      <Routes>
        {
          isAuthenticated ? (
            <>
              <Route path="/" element={<Navigate to="/home" />} />
              <Route path="/home/*" element={<HomePage />} />
            </>
          ) : (
            <>
              <Route index element={<LoginPage />} />
              <Route path="/" element={<LoginPage />} />
              <Route path="*" element={<Navigate to="/" />} />

            </>
          )
        }
      </Routes>

    </>
  )
}

export default App
