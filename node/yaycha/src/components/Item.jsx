export default function Item({ item, remove }) {
  return (
    <li
      style={{
        padding: 10,
        borderBottom: "1px solid #ddd",
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
      }}
    >
      <span>
        {item.content} - <b>{item.name}</b>
      </span>
      <button
        onClick={() => remove(item.id)}
        style={{
          padding: "4px 8px",
          marginLeft: 8,
          color: "#fff",
          background: "#dc3545",
          border: "none",
          borderRadius: 4,
        }}
      >
        Remove
      </button>
    </li>
  );
}