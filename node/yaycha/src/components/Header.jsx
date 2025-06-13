import { useApp } from "../ThemedApp";
import { Box, AppBar, Toolbar, Typography, IconButton } from "@mui/material";
import {
  Menu as MenuIcon,
  Add as AddIcon,
  LightMode as LightModeIcon,
  DarkMode as DarkModeIcon,
} from "@mui/icons-material";

export default function Header() {
  const { showForm, setShowForm, mode, setMode } = useApp();

  return (
    <AppBar position="static">
      <Toolbar>
        <IconButton color="inherit" edge="start" sx={{ mr: 2 }}>
          <MenuIcon />
        </IconButton>
        <Typography sx={{ flexGrow: 1, ml: 2 }}>Yaycha</Typography>
        <Box>
          <IconButton
            color="inherit"
            onClick={() => setShowForm(!showForm)}
            title={showForm ? "Hide form" : "Show form"}
          >
            <AddIcon />
          </IconButton>
          <IconButton
            color="inherit"
            edge="end"
            onClick={() => setMode(mode === "dark" ? "light" : "dark")}
            title="Toggle light/dark mode"
          >
            {mode === "dark" ? <LightModeIcon /> : <DarkModeIcon />}
          </IconButton>
        </Box>
      </Toolbar>
    </AppBar>
  );
}