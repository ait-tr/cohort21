import React, { useEffect } from "react";
import styles from './Posts.module.css';
import {useState} from 'react';
import List from "../List/List";

interface Post{
    id: number;
    userId:number;
    title: string;
    body: string;
}


function Posts():JSX.Element {

    const [posts, setPosts] = useState<string []>([]);

    async function loadPosts(): Promise<string[]>{
        const response =await fetch("https://jsonplaceholder.typicode.com/posts");
        const obj: Post[] = await response.json() as Post[];
        const strings:string[] =  obj.map( (post:Post):string=>{return post.body;}         );

        return strings;

    }  
    

   /* 
    async function loadPosts1(): Promise<Post[]>{
        const response =await fetch("https://jsonplaceholder.typicode.com/posts");
        const obj: Post[] = await response.json() as Post[];
        return obj;

    }
    */  
    
    useEffect( () => {
        loadPosts().then(posts=> setPosts(posts));
    },[]);

    


    return (
        <div>
            <h1 className={styles.qwe}>
                qwe temp
            </h1>
            <List  names={posts} heading="Посты"/>   

        </div>
        
    );


}
export default Posts;
