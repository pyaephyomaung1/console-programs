import { useApp } from "./ThemedApp";
import Header from "./components/Header";
import Form from "./components/Form";
import Item from "./components/Item";
import "./App.css"; 

import { useState } from "react";

export default function App() {
  const [data, setData] = useState([
    { id: 1, content: "Hello, World!", name: "Alice" },
    { id: 2, content: "React is fun.", name: "Bob" },
    { id: 3, content: "Yay, interesting.", name: "Chris" },
  ]);

  const { showForm } = useApp();

  const remove = (id) => setData(data.filter((item) => item.id !== id));
  const add = (content, name) => {
    const id = data.length > 0 ? data[data.length - 1].id + 1 : 1;
    setData([...data, { id, content, name }]);
  };

  return (
    <div
      style={{
        maxWidth: 600,
        margin: "20px auto",
        padding: 16,
        borderRadius: 12,
      }}
    >
      <Header />
      {showForm && <Form add={add} />}
        {data.map((item) => (
          <Item key={item.id} item={item} remove={remove} />
        ))}
    </div>
  );
}