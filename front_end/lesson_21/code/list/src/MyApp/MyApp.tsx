import React from "react";
import {Routes, Route} from 'react-router-dom';
import Userposts from '../Userposts/Userposts';
import Bootstrap from '../Bootstrap/Bootstrap';
import Msg from '../Msg/Msg';
import Posts from "../Posts/Posts";
import Layout from "../Layout/Layout";
import Layoutlink from "../Layoutlink/Layoutlink";

function MyApp():JSX.Element{

    return(
        <Routes>
            <Route path="/" element={<Layoutlink/>} >
                <Route path="/users/"  element = {<Userposts />} />
                <Route path="/msg/"  element = {<Msg />} />
                <Route path="/posts/"  element = {<Posts />} />
                <Route path="/bootstrap/"  element = {<Bootstrap />} />
            </Route>
        </Routes>
    );

}
export default MyApp;