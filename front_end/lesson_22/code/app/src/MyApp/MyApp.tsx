import React from 'react';
import {Routes, Route} from 'react-router-dom';
import Layout from "../Layout/Layout";
import Page1 from "../Page1/Page1";
import Page2 from "../Page2/Page2";
import Page3 from "../Page3/Page3";
import Page from "../Page/Page";



function MyApp():JSX.Element{
    return(
        <Routes>
            <Route path="/" element={<Layout/>} >
                <Route path="/page/1"  element = {<Page1 />} />
                <Route path="/page/2"  element = {<Page2 />} />
                <Route path="/page/3"  element = {<Page3 />} />
                <Route path="/page/:id"  element = {<Page />} />

            </Route>
        </Routes>
    );

}
export default MyApp;