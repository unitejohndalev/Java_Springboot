export interface UserInfo {
    id: string;
    username:string;
    password:string;
    email:string;
    role:string;
}

export interface UserState {
    users: UserInfo[];
    userInfo: UserInfo;
    isLoading: boolean;
    isLoadingDialog: boolean;
    isAddSuccess: boolean;
    saved: boolean;
    isAuthenticated: boolean;
    token: string;
}

export type UserInput = {
    username: string,
    password: string
}