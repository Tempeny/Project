const Tecla = ({ label, onClick, wide = false }) => {
    return (
        <button
            className={`tecla ${wide ? 'wide' : ''}`}
            onClick={() => onClick(label)}>

            {label} 
        </button>
    );
};

export default Tecla;