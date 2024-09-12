// sagas/userListSaga.ts
import { call, put, takeEvery } from "redux-saga/effects";
import axios from "axios";
import { getPayrollSuccess, getPayrollFailure } from "../state/payrollState";
import { getPayroll } from "../../api/Api";

// Fetch Demo Console

function* fetchPayroll(): any {
  try {
    const token = localStorage.getItem("token");

    if (token) {
      const demo = yield call(() =>
        axios
          .get(getPayroll, {
            headers: {
              Authorization: `Bearer ${token}`,
            },
          })
          .then((res) => res.data)
      );
      yield put(getPayrollSuccess(demo));
    } else {
      yield put(getPayrollFailure("Token not found"));
    }
  } catch (error) {
    yield put(getPayrollFailure(error.message));
  }
}

export function* PayrollSaga() {
  yield takeEvery("demo/getPayrollFetch", fetchPayroll);
}
