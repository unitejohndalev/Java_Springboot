import { UserInput, UserState } from "../../types/types";
import { PayloadAction, createSlice } from "@reduxjs/toolkit";



//user info authentication
const initialState: UserState = {
    users:[],
    userInfo: 
    {
        id: "",
        username: "",
        password: "",
        email: "",
        role: ""
    },
    isLoading: false,
    isLoadingDialog: false,
    isAddSuccess: false,
    saved: false,
    isAuthenticated: localStorage.getItem("isAuthenticated") === "true",
    token: localStorage.getItem("token") || ""
}



const userSlice = createSlice({
    name:'users',
    initialState: initialState,
    reducers: {
      loginFetch: (state, action: PayloadAction<{ username: string; password: string }>) => {
      state.isLoading = true;
    },
        loginSuccess: (state, action) => {
            state.isLoading = false;
            state.isAuthenticated = true;
            state.token = action.payload.token;
            state.userInfo = action.payload.userInfo;
        },
        loginFailed: (state) => {
            state.isLoading = false;
            state.isAuthenticated = false;
            state.token = "";
        },
        logout:(state) => {
            state.isAuthenticated = false;
            state.token = "";
            state.userInfo = initialState.userInfo;
            console.log("Successfully logged out and cleared user data");
        }

        }
    
})

export const { loginFetch, loginSuccess, loginFailed, logout } = userSlice.actions;
export const UserReducer = userSlice.reducer;


//user login 
const inputInitialState: UserInput = {
    username:"",
    password:""
}

const InputSlice = createSlice({
    name:"userInput",
    initialState: inputInitialState,
    reducers: {
        setUserField: (state, action: PayloadAction<Partial<UserInput>>) => {
            return {...state, ...action.payload}
        }
    }
})

export const { setUserField } = InputSlice.actions;
export const UserInputReducer = InputSlice.reducer;