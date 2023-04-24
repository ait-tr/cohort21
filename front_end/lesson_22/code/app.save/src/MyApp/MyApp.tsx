import React from 'react';
import {Routes, Route} from 'react-router-dom';
import Layout from "../Layout/Layout";
import Page1 from "../Page1/Page1";
import Page2 from "../Page2/Page2";
import Page3 from "../Page3/Page3";



function MyApp():JSX.Element{
    return(
        <Routes>
            <Route path="/" element={<Layout/>} >
                <Route path="/page1/"  element = {<Page1 />} />
                <Route path="/page2/"  element = {<Page2 />} />
                <Route path="/page3/"  element = {<Page3 />} />

            </Route>
        </Routes>
    );

}
export default MyApp;