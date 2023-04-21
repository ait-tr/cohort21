import React from "react";
import {Routes, Route} from 'react-router-dom';
import Users from '../Users/Users';
import Msg from '../Msg/Msg';
import Posts from "../Posts/Posts";
import Layout from "../Layout/Layout";
import Layoutlink from "../Layoutlink/Layoutlink";

function MyApp():JSX.Element{

    return(
        <Routes>
            <Route path="/" element={<Layoutlink/>} >
                <Route path="/users/"  element = {<Users />} />
                <Route path="/msg/"  element = {<Msg />} />
                <Route path="/posts/"  element = {<Posts />} />
            </Route>
        </Routes>
    );

}
export default MyApp;