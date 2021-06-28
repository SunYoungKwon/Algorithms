const solution = (n, computers) => {
  let answer = 0
  const visited = Array(n).fill(false)
  
  computers.forEach((computer, computerIndex) => {
      if(visited[computerIndex]) return
      
      let queue = [computerIndex]
      let temp = []
      
      while(queue.length > 0) {
          queue.forEach(node => {
              visited[node] = true
              
              computers[node].forEach((isConnected, connectedComputer) => {
                  if(!visited[connectedComputer] && isConnected) {
                      temp.push(connectedComputer)
                  }
              })
          })
          
          queue = temp
          temp = []
      }
      
      answer++
  })
  
  return answer
}
