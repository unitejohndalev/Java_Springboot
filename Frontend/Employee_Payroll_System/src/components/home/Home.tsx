import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import { RootState } from "../../redux/store"
import { logout } from "../../redux/state/userState"
import { getPayrollFetch } from "../../redux/state/payrollState"
import { useEffect } from "react"


const Home = () => {
  const navigate = useNavigate()
  const dispatch = useDispatch()

  const { payrollConsole , error, isLoading} = useSelector((state: RootState) => state.PayrollReducer )
  
  const pageLogout = () => {
    localStorage.removeItem("token");
    localStorage.setItem("isAuthenticated", "false");
    dispatch(logout())
    navigate(`/`);

  };

  useEffect(() => {
    dispatch(getPayrollFetch());

  }, [ dispatch ]);
  


  const payrollState = () => {

    if (error) {
      alert(`Fetch failed: ${error}`);
    } else if (payrollConsole) {
      alert("Fetch success");
    }
  }

  const payrollHandle = () => {
    payrollState()
    console.log(payrollConsole)
  }
  
  return (
    <div>
      Home
      {isLoading ? <p>Loading...</p> : null}
      <button onClick={payrollHandle}>Demo Console Backend</button>
      <button onClick={pageLogout}>Logout</button>
    </div>
  )
}

export default Home