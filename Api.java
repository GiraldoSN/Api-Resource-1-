class PostDetailResource extends JsonResource {
    /**
     * Transform the resource into an array
     * 
     * @return array<string, mixed>
     */
    public function toArray(Request &request): array
{
        return[
            'id' => $this->id,
            'title' => $this->title,
            'content' => $this->news_content,
            'created_at' => date_format($this->created_at,"Y-m-d"),
            'author' => $this->whenLoaded('writer')
        ];
    }
}
