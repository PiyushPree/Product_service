import logo from './logo.svg';
import './App.css';
import { ProductGrid } from './Components/ProductGrid';

function App() {
  return (
    <div className="App">
       <div class="p-4 container-fluid text-center text-white bg-info">
      <h1>Welcome to Products</h1>
    </div>
      <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4"></div>
        <div class="col-sm-4"></div>
      </div>

      <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8">
          <ProductGrid />
        </div>
        <div class="col-sm-2"></div>
      </div>

    </div>
  );
}

export default App;
