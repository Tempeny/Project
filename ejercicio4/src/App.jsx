import { useState } from 'react'
import Display from './components/Display'
import Tecla from './components/Tecla'
import './App.css'

const App = () => {
  const [valor, setValor] = useState('');
  const [resultado, setResultado] = useState(null);

  const manejarClick = (tecla) => {
    if (tecla === 'C') {
      setValor('');
      setResultado(null);
    } else if (tecla === '=') {
      try {
        setResultado(eval(valor)); 
      } catch {
        setResultado('Error');
      }
    } else {
      setValor((prev) => prev + tecla);
    }
  };

  const teclas = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+',
    'C'
  ];

  return (
    <div className="calculadora">
      <Display value={resultado !== null ? resultado : valor || '0'} />
      <div className="teclado">
        <Tecla label="C" onClick={manejarClick} wide />
        {teclas.map((t) => (
          <Tecla key={t} label={t} onClick={manejarClick} />
        ))}
      </div>
    </div>
  );
};

export default App
