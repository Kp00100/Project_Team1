import React from 'react';
import { Link } from 'react-router-dom';

function NavbarComponent() {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
      <div className="container-fluid">
        <Link className="navbar-brand" to="/">Online Pharmacy</Link>
        <div className="collapse navbar-collapse">
          <ul className="navbar-nav ms-auto">
            <li className="nav-item"><Link className="nav-link" to="/">Home</Link></li>
            <li className="nav-item"><Link className="nav-link" to="/cart">Cart</Link></li>
            <li className="nav-item"><Link className="nav-link" to="/orders">Orders</Link></li>
          </ul>
        </div>
      </div>
    </nav>
  );
}

export default NavbarComponent;
