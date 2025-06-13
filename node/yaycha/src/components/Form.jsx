import { useRef } from "react";
import { useApp } from "../ThemedApp";

export default function Form({ add }) {
  const contentRef = useRef();
  const nameRef = useRef();
  const { mode } = useApp();

  return (
    <form
      style={{
        display: "flex",
        flexDirection: "column",
        gap: 6,
        padding: 10,
        borderRadius: 8,
        marginBottom: 20,
        background: mode === "dark" ? "#555" : "#def",
      }}
      onSubmit={(e) => {
        e.preventDefault();
        const content = contentRef.current.value.trim();
        const name = nameRef.current.value.trim();
        if (!content || !name) return;
        add(content, name);
        e.currentTarget.reset();
      }}
    >
      <input type="text" ref={contentRef} placeholder="Content" style={{ padding: 5 }} />
      <input type="text" ref={nameRef} placeholder="Name" style={{ padding: 5 }} />
      <button
        type="submit"
        style={{
          padding: 8,
          background: "#0d6efd",
          color: "white",
          border: "0 none",
        }}
      >
        Post
      </button>
    </form>
  );
}