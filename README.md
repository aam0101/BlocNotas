# 📓 BlocNotas – Diseño de Interfaces de Login

## 🎯 Objetivo
El objetivo de este proyecto es crear **interfaces gráficas de inicio de sesión** usando **IntelliJ GUI Designer** y **Java Swing**, explorando componentes, propiedades visuales y organización, **sin implementar la lógica de eventos**.

Se entregan tres versiones de interfaz:

1. **Clásica** – Componentes básicos.
2. **Extendida** – Extras como JComboBox, JRadioButton y JPanel.
3. **Creativa** – Componentes menos comunes: JTabbedPane, JProgressBar, JSlider.

---

## 🖼️ Versiones de Interfaz

### 1️⃣ Login Clásico
- **Componentes:** JLabel (logo), JTextField, JPasswordField, JCheckBox, JButton.
- **Propiedades destacadas:** 
  - `setFont`, `setForeground`, `setBackground`
  - `setToolTipText`  
  - `setHorizontalAlignment`
  

---

### 2️⃣ Login Extendido
- **Componentes adicionales:** JComboBox (idioma), JRadioButton (Recordar usuario), JPanel.
- **Propiedades destacadas:** 
  - Colores y fuentes personalizadas  
  - Tooltips explicativos  
  - Paneles para organizar la estructura  


---

### 3️⃣ Login Creativo
- **Componentes adicionales:** JTabbedPane (Login vs Registro), JProgressBar, JSlider.
- **Propiedades destacadas:** 
  - Colores y fuentes llamativas  
  - Tooltips para interacción  
  - Barra de progreso simulada  


---

## 📋 Componentes y Propiedades

| Versión | Componente | Propiedades modificadas | Explicación |
|---------|------------|------------------------|-------------|
| Clásica | JLabel “BlocNotas” | setFont, setHorizontalAlignment | Destaca el logo |
| Clásica | JButton “Acceder” | setBackground, setForeground, setToolTipText | Destaca acción principal |
| Extendida | JComboBox Idioma | setToolTipText | Permite elegir idioma |
| Extendida | JRadioButton “Recordar usuario” | Ninguna | Mejora UX |
| Creativa | JTabbedPane | Ninguna | Separación login / registro |
| Creativa | JProgressBar | setValue | Simula carga |
| Creativa | JSlider | setToolTipText | Interactividad |

> 💡 Puedes consultar el código en `src/main/java/login/` para ver más detalles.

---

## ✅ Conclusión
Este proyecto demuestra la **capacidad de diseño de interfaces gráficas** en Java Swing, explorando:

- Organización con layouts y paneles  
- Personalización visual de componentes  
- Variación de interfaces según complejidad y creatividad  

---
