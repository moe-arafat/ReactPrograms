import React, { useState } from "react";

import "../src/App.css";

function App(){
    
    const list = [
        "Black", "Orange", "Brown", "Green", "Yellow", "Red", "White", "Purple", "Pink"
    ];
    
    const [filterList, setFilterList] = useState(list);

  const handleSearch = (event) => {

    if (event.target.value === "") {
      setFilterList(list);
      return;
    }
    const filteredValues = list.filter(
      (item) =>
        item.toLowerCase().indexOf(event.target.value.toLowerCase()) !== -1
    );
    setFilterList(filteredValues);
  };
  return (
    <div className="app">
      <div>
        Search: <input className="textbar" name="query" type="text" onChange={handleSearch} />
      </div>
      {filterList &&
        filterList.map((item, index) => (
          <div className="list" key={index}>{item}</div>
        ))}
    </div>
  );
}

export default App;