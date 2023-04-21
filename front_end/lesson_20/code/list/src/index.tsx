import React from 'react';
import ReactDOM from 'react-dom/client';
//import './index.css';
import 'bootstrap/dist/css/bootstrap.css';
//import App from './App/App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
import MyApp from './MyApp/MyApp';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
let names: string[] = ["Jack", "John", "Lena", "Ann","qwe"];
let cities: string[] = ["Berlin", "Paris", "Vena"];
root.render(
  //<React.StrictMode>
    <BrowserRouter>
      <MyApp />
    </BrowserRouter>  
  //<React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
