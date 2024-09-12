import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.tsx'
import './index.css'

import { BrowserRouter as Router } from 'react-router-dom'
import store from './redux/store.ts'
import { Provider } from 'react-redux'

createRoot(document.getElementById('root')!).render(


  <StrictMode>
    <Router>
      <Provider store={store}>
        <App />
      </Provider>
    </Router>
  </StrictMode>,
)
