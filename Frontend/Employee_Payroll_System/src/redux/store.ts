import createSagaMiddleware from 'redux-saga';
import { configureStore } from '@reduxjs/toolkit';
import { UserInputReducer, UserReducer } from './state/userState';
import rootSaga from './saga/rootSaga';
import { PayrollReducer } from './state/payrollState';




const saga = createSagaMiddleware();
export const store = configureStore({
    reducer: {
        UserInputReducer: UserInputReducer,
        UserReducer: UserReducer,
        PayrollReducer: PayrollReducer
    },
    middleware:[saga],
});

saga.run(rootSaga);

export type RootState = ReturnType<typeof store.getState>;
export default store;