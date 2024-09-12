import { all } from "redux-saga/effects";
import { AuthSaga } from "./authSaga";
import { PayrollSaga } from "./payrollSaga";

export default function* rootSaga() {
    yield all([
        AuthSaga(),
        PayrollSaga()
    ])
}