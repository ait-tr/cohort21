import React, { useState } from 'react';
import Printer from '../Printer/Printer';
import './TextInput.css';


const TextInput = () => {
    let [textInput, setValue] = useState("");
    function handleChange(event: React.ChangeEvent<HTMLTextAreaElement>): void {
        setValue(event.target.value);
    }

    return (<div className="TextInput">
        <textarea name='value' value={textInput} onChange={handleChange} placeholder="Print Something" />
        <Printer peredaem={textInput} />
    </div>
    );
};

export default TextInput;