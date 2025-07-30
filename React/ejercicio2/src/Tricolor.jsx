import React, { useState } from 'react';
import './App.css';

function Tricolor() {
    const colors = ['gray','red', 'green', 'blue'];
    const [index, setIndex] = useState(0);

    return (
        <div className='tricolor-circle' style={{backgroundColor: colors[index]}} onClick={() => setIndex((index + 1) % colors.length)}/>
    );
}

export default Tricolor;
