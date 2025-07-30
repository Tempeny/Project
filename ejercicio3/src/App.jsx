import { useEffect, useState } from 'react';
import ciudadesData from './data/ciudades.json';
import './App.css';

function App() {
  const [provinciaSeleccionada, setProvinciaSeleccionada] = useState(null);
  const [poblacionMinima, setPoblacionMinima] = useState(20000);
  const [ciudadesFiltradas, setCiudadesFiltradas] = useState([]);

  useEffect(() => {
    filtrarCiudades();
  }, [provinciaSeleccionada, poblacionMinima]);

  const filtrarCiudades = () => {
    const filtradas = ciudadesData.filter((ciudad) => {
      const cumpleProvincia =
        !provinciaSeleccionada || ciudad.provincia === provinciaSeleccionada;
      const cumplePoblacion = ciudad['población'] >= poblacionMinima;
      return cumpleProvincia && cumplePoblacion;
    });

    setCiudadesFiltradas(filtradas);
  };

  const provincias = ['Barcelona', 'Tarragona', 'Lérida', 'Gerona'];

  return (
    <div className="App">
      <h1>Ciudades de Cataluña</h1>

      <div className="controls">
        {provincias.map((prov) => (
          <button
            key={prov}
            onClick={() => setProvinciaSeleccionada(prov)}
            className={provinciaSeleccionada === prov ? 'active' : ''}
          >
            {prov}
          </button>
        ))}

        <div className="slider-container">
          <label htmlFor="slider">Población mínima:</label>
          <input
            id="slider"
            type="range"
            min={20000}
            max={150000}
            step={10000}
            value={poblacionMinima}
            onChange={(e) => setPoblacionMinima(Number(e.target.value))}
          />
          <span>{poblacionMinima.toLocaleString()}</span>
        </div>
      </div>

      <table>
        <thead>
          <tr>
            <th>Municipio</th>
            <th>Provincia</th>
            <th>Comarca</th>
            <th>Población</th>
          </tr>
        </thead>
        <tbody>
          {ciudadesFiltradas.map((ciudad) => (
            <tr key={ciudad.municipio}>
              <td>{ciudad.municipio}</td>
              <td>{ciudad.provincia}</td>
              <td>{ciudad.comarca}</td>
              <td>{ciudad['población'].toLocaleString()}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
