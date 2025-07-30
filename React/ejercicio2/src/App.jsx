import React from 'react';
import Thumbs from './Thumbs';
import Tricolor from './Tricolor';
import Fotos from './Fotos';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Thumbs</h2>
      <Thumbs />
      <h2>Tricolor</h2>
      <Tricolor />
      <h2>Fotos</h2>
      <Fotos /> 
    </div>
  );
}

export default App; 