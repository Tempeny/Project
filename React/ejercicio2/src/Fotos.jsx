import React, { useState } from 'react';
import './App.css';

function Fotos() {
  const [seleccion, setSeleccion] = useState('bici');

  const imagenes = {
    coche: 'https://i.imgur.com/tSx7kys.jpeg',
    moto: 'https://i.imgur.com/Stz1BbH.jpeg',
    bici: 'https://i.imgur.com/u1bcXAD.jpeg',
    bus: 'https://i.imgur.com/orB5LBm.jpeg',
  };

  const handleChange = (e) => {
    setSeleccion(e.target.value);
  };

  return (
    <div className="fotos-container">
      <label htmlFor="vehiculos">Elige un vehículo: </label>
      <select id="vehiculos" value={seleccion} onChange={handleChange}>
        <option value="coche">Coche</option>
        <option value="moto">Moto</option>
        <option value="bici">Bici</option>
        <option value="bus">Bus</option>
      </select>

      <div className="foto-imagen">
        <img src={imagenes[seleccion]} alt={seleccion} />
      </div>
    </div>
  );
}

export default Fotos;
