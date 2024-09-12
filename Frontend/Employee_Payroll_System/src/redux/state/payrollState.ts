import { createSlice } from "@reduxjs/toolkit";



const payrollSlice = createSlice({
  name: "demo",
  initialState: {
    payrollConsole: null,
    isLoading: false,
    isAddSuccess: false,
    error: null,
  },
  reducers: {
    getPayrollFetch: (state) => {
      state.isLoading = true;
      state.error = null; 
    },
    getPayrollSuccess: (state, action) => {
      state.payrollConsole = action.payload;
      state.isLoading = false;
    },
    getPayrollFailure: (state, action) => {
      state.isLoading = false;
      state.error = action.payload;
    },
  },
});

export const { getPayrollFetch, getPayrollSuccess, getPayrollFailure } = payrollSlice.actions;

export const PayrollReducer = payrollSlice.reducer;

