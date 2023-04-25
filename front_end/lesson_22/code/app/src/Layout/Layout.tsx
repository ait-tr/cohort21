import React from "react";
import {Outlet, useNavigate} from 'react-router-dom';
import Formin from "../Formin/Formin";




function Layout():JSX.Element {

    const navigate = useNavigate();

    return(

        <div>
            <h1> Мой сайт</h1>
            <div>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate('/')  }>Домой</button>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate('/page1/')  }>Page 1</button>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate('/page2/')  }>Page 2</button>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate('/page3/')  }>Page 3</button>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate(-1)  }>Назад</button>
                <button type="button" className="btn btn-outline-primary" onClick={()=> navigate(1)  }>Вперед</button>
                <Formin />


            </div>
            <Outlet />
        </div>

    );
}

export default Layout;

