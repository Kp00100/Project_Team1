import React, { useEffect, useState } from 'react';

function DrugList() {
  const [drugs, setDrugs] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/drugs')
      .then(response => response.json())
      .then(data => setDrugs(data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div>
      <h2>Available Drugs</h2>
      <div className="row">
        {drugs.map(drug => (
          <div className="col-md-4" key={drug.id}>
            <div className="card mb-3">
              <div className="card-body">
                <h5 className="card-title">{drug.name}</h5>
                <p className="card-text">Price: ${drug.price}</p>
                <button className="btn btn-success">Add to Cart</button>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default DrugList;
