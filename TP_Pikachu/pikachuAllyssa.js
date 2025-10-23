const inputName = document.getElementById("inputName");
const btnStart = document.getElementById("btnStart");
const formStart = document.getElementById("formStart");
const container = document.getElementById("gameContainer");
const pikachu = document.getElementById("pikachu");
const imgPikachu = document.getElementById("imgPikachu");
const pokemonName = document.getElementById("pokemonName");
const toupis = document.getElementById("toupis");
const bgm = document.getElementById("bgm");

let posX = 400;
let posY = 300;
let direction = "Down";
const speed = 15;

let hyperX = 100;
let hyperY = 100;
const hyperSpeed = 1.5;
let playerName = "";

inputName.addEventListener("input", () => {
  btnStart.disabled = inputName.value.trim() === "";
});

btnStart.addEventListener("click", () => {
  playerName = inputName.value.trim();
  if (playerName === "") return;

  formStart.style.display = "none";
  container.style.display = "block";

  pokemonName.textContent = playerName;
  pikachu.title = playerName;

  bgm.play();
  updatePikachuPosition();
  movetoupis();
});

document.addEventListener("keydown", (e) => {
  if (container.style.display !== "block") return;

  switch (e.key) {
    case "ArrowUp":
    case "z":
      direction = "Up";
      posY = Math.max(0, posY - speed);
      imgPikachu.src = "assets/img/pikachuUp.png";
      break;
    case "ArrowDown":
    case "s":
      direction = "Down";
      posY = Math.min(container.offsetHeight - 64, posY + speed);
      imgPikachu.src = "assets/img/pikachuDown.png";
      break;
    case "ArrowLeft":
    case "q":
      direction = "Left";
      posX = Math.max(0, posX - speed);
      imgPikachu.src = "assets/img/pikachuLeft.png";
      break;
    case "ArrowRight":
    case "d":
      direction = "Right";
      posX = Math.min(container.offsetWidth - 64, posX + speed);
      imgPikachu.src = "assets/img/pikachuRight.png";
      break;
  }

  updatePikachuPosition();
});

function updatePikachuPosition() {
  pikachu.style.left = posX + "px";
  pikachu.style.top = posY + "px";
}

function movetoupis() {
  const dx = posX - hyperX;
  const dy = posY - hyperY;
  const distance = Math.sqrt(dx * dx + dy * dy);

  if (distance > 1) {
    hyperX += (dx / distance) * hyperSpeed;
    hyperY += (dy / distance) * hyperSpeed;
  }

  toupis.style.left = hyperX + "px";
  toupis.style.top = hyperY + "px";
  toupis.style.transform = `rotate(${performance.now() / 10}deg)`;

  if (Math.abs(posX - hyperX) < 20 && Math.abs(posY - hyperY) < 20) {
    container.style.backgroundImage = "url('assets/img/water.png')";
    bgm.pause();
    alert(`L'hyper vitesse de mon Pegasus t'a battue !`);
    window.location.reload();
  }
  requestAnimationFrame(movetoupis);
}
