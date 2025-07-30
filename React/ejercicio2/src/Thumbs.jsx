import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faThumbsUp, faThumbsDown } from '@fortawesome/free-solid-svg-icons';
import './App.css';

function Thumbs() {
  const [isLiked, setIsLiked] = useState(true);

  return (
    <div className="thumbs-icon" onClick={() => setIsLiked(!isLiked)}>
      <FontAwesomeIcon icon={isLiked ? faThumbsUp : faThumbsDown} />
    </div>
  );
}

export default Thumbs;
