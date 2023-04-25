import React from 'react';
import styles from './Bootstrap.module.css'

function  Bootstrap():JSX.Element{
    return(
        <>
          <h1>Bootstrap</h1>
          <div className={'container '+styles.red}>
            <div className='row'>
                <div className="col-lg-3 col-md-6 col-sm-6">
                       <img className="w-100" src="https://blog.logrocket.com/wp-content/uploads/2021/09/optimizing-performance-react-application.png" alt="q" />
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
                      Et veniam quidem voluptatum magni voluptates. 
                      Accusamus dignissimos quo eius, cumque quos at, veniam 
                      repudiandae vel fugiat dicta hic eum odio officia?          
                </div>
                <div className="col-lg-3 col-md-6 col-sm-6">
                <img className="w-100" src="https://blog.logrocket.com/wp-content/uploads/2021/09/optimizing-performance-react-application.png" alt="q" />  
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
                      Et veniam quidem voluptatum magni voluptates. 
                      Accusamus dignissimos quo eius, cumque quos at, veniam 
                      repudiandae vel fugiat dicta hic eum odio officia?          
                </div>
                <div className="col-lg-3 col-md-6">
                <img className="w-100" src="https://blog.logrocket.com/wp-content/uploads/2021/09/optimizing-performance-react-application.png" alt="q" />
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
                      Et veniam quidem voluptatum magni voluptates. 
                      Accusamus dignissimos quo eius, cumque quos at, veniam 
                      repudiandae vel fugiat dicta hic eum odio officia?          
                </div>
                <div className="col-lg-3 col-md-6">
                <img className="w-100" src="https://blog.logrocket.com/wp-content/uploads/2021/09/optimizing-performance-react-application.png" alt="q" />
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
                      Et veniam quidem voluptatum magni voluptates. 
                      Accusamus dignissimos quo eius, cumque quos at, veniam 
                      repudiandae vel fugiat dicta hic eum odio officia?          
                </div>
            </div>
          </div>
        </>  
    );

}
export default Bootstrap;
